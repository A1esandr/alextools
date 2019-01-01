# -*- coding: utf-8 -*-
from bs4 import BeautifulSoup
import urllib3
import re

links = []
site = "https://alextoolsblog.blogspot.com"
pattern = "://alextoolsblog.blogspot.com"
 
def getLinks(url, pattern, html_only=True):

    http = urllib3.PoolManager()
    html_page = http.request('GET', url)

    soup = BeautifulSoup(html_page.data, features="html.parser")

    # Используем отдельный паттерн, поскольку, например на blogspot, могут быть ссылки как http, так и https
    for link in soup.findAll('a', attrs={'href': re.compile(pattern)}):
      if link.get('href') not in links:
        if html_only:
            if ".html" == link.get('href')[-5:]:
              links.append(link.get('href'))
        else:
            links.append(link.get('href'))

    print(len(links))
 
    return links

def main():
    getLinks(site, pattern)
    print("----------Ссылки с главной страницы-----------")
    print(links)

    for link in links:
    	print("----------LINK-----------")
    	print(link)
    	getLinks(link, pattern)

    print(links)

if __name__ == "__main__":
    main()
