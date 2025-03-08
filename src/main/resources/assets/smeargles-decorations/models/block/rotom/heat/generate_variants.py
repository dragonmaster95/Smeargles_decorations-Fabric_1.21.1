import json
import shutil

# List of names you want to create JSON files for
names = ['rotom', 'shiny','pokedex','white','light_gray','gray','black','brown','red','orange','yellow','lime','green','cyan','light_blue','blue','purple','magenta','pink']  # Replace with your list of names

# Path to the existing template JSON file
template_file = 'rotom.json'  # Replace with the path to your template JSON file

# Loop over each name in the list and create a corresponding JSON file
for index, name in enumerate(names):
    # Open the existing template and read its content
    with open(template_file, 'r') as template_json:
        template_content = json.load(template_json)
    
    # Optionally, update other values based on your needs
    base_texture = f"smeargles-decorations:block/rotom/heat_variations/{index}"
    template_content["textures"]["0"] = base_texture
    template_content["textures"]["particle"] = base_texture

    # Define the filename based on the name
    filename = f"{name}.json"
    
    # Write the updated content to the new JSON file
    with open(filename, 'w') as json_file:
        json.dump(template_content, json_file, indent=4)

    print(f"Created {filename}")
