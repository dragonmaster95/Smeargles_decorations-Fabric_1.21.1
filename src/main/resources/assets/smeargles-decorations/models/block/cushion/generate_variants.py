import json
import shutil

# List of names you want to create JSON files for
names = ['normal', 'fighting', 'flying', 'rock', 'ground','bug','poison','psychic','ghost','ice','water','fire','grass','electric','dragon','dark','steel','fairy']  # Replace with your list of names

# Path to the existing template JSON file
template_file = 'bug.json'  # Replace with the path to your template JSON file

# Loop over each name in the list and create a corresponding JSON file
for name in names:
    # Open the existing template and read its content
    with open(template_file, 'r') as template_json:
        template_content = json.load(template_json)
    
    # Optionally, update other values based on your needs
    template_content["textures"]["wool"] = f"smeargles-decorations:block/cushion/{name}"

    # Define the filename based on the name
    filename = f"{name}.json"
    
    # Write the updated content to the new JSON file
    with open(filename, 'w') as json_file:
        json.dump(template_content, json_file, indent=4)

    print(f"Created {filename}")
