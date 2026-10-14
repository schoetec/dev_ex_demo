# Add feature to add a Home button in the landingspage.



## Overview

Add a new button on the landingspage that will is called Home button.
When when the Home button is clicked redirect to "/" and refresh the page to it's default landingspage.

## Solution

Add a `Home` button. And redirect to "/"

## Use as reference 

Use as reference of what the WebPortal is all about @/context/features/webportal-add-new-vaadin-portal.md

## Changes Required

- Add button in the .\SpringWeb\WebPortal\src\main\java\com\example\webportalMainView.java portal landingspage.
- Add redirect to "/" in the .\SpringWeb\WebPortal\src\main\java\com\example\webportal\CallController.java called GotoHome.
- When button is clicked call the GotoHome member of CallController. 
- Add basic errorhandler for the GotoHome member so that when an error occures the error dialog is shown.