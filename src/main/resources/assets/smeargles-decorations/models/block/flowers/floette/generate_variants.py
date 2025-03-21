import json
import shutil

# List of names you want to create JSON files for
names = ['white','red', 'orange','yellow','blue','pink']  # Replace with your list of names


# Loop over each name in the list and create a corresponding JSON file
for index, name in enumerate(names):
	data = {
		"parent":"smeargles-decorations:block/flowers/floette/base",
		"textures": {
			"0": f"smeargles-decorations:block/flowers/floette_variations/{index}",
			"particle": f"smeargles-decorations:block/flowers/floette_variations/{index}"
		}
	}
	
	# Define the filename based on the name
	filename = f"{name}.json"
	
	# Write the updated content to the new JSON file
	with open(filename, 'w') as json_file:
		json.dump(data, json_file, indent=4)

	print(f"Created {filename}")

# Loop over each name in the list and create a corresponding JSON file
for index, name in enumerate(names):
	data = {
		"parent":"smeargles-decorations:block/flowers/floette/base_bed",
		"textures": {
			"0": f"smeargles-decorations:block/flowers/floette_variations/{index}",
			"particle": f"smeargles-decorations:block/flowers/floette_variations/{index}"
		}
	}
	
	# Define the filename based on the name
	filename = f"{name}_bed.json"
	
	# Write the updated content to the new JSON file
	with open(filename, 'w') as json_file:
		json.dump(data, json_file, indent=4)

	print(f"Created {filename}")


# Loop over each name in the list and create a corresponding JSON file
for index, name in enumerate(names):
	data = {
		"parent":"smeargles-decorations:block/flowers/floette/base_potted",
		"textures": {
			"0": f"smeargles-decorations:block/flowers/floette_variations/{index}",
			"particle": f"smeargles-decorations:block/flowers/floette_variations/{index}"
		}
	}
	
	# Define the filename based on the name
	filename = f"{name}_potted.json"
	
	# Write the updated content to the new JSON file
	with open(filename, 'w') as json_file:
		json.dump(data, json_file, indent=4)

	print(f"Created {filename}")
