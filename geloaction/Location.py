

import requests

# Example with a random API provider's base URL (replace with your provider's URL)
api_key = "b873f2468ec0472cbeb4e65f3691c248"
ip_address = "49.207.180.125"  # Example IP
url = f"https://api.ipgeolocation.io/ipgeo?apiKey={api_key}&ip={ip_address}"

response = requests.get(url)

if response.status_code == 200:
    data = response.json()
    print(f"IP: {data['ip']}")
    print(f"Country: {data['country_name']}")
    print(f"Region: {data['state_prov']}")
    print(f"City: {data['city']}")
    print(f"Latitude: {data['latitude']}")
    print(f"Longitude: {data['longitude']}")
else:
    print("Error fetching data")



















