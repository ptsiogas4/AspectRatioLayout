
# AspectRatioLayout
This is a simple library that helps you use all of your classic android widget.Views with an extra attribute, the aspectRatio. You can use aspectRatio byWidth or byHeight. If you have any questions or suggestions, please don't hesitate to send me an e-mail, enjoy!


## Screenshots

![Sample](https://raw.githubusercontent.com/ptsiogas4/AspectRatioLayout/master/Screenshots/screenshot1.png)
![Sample](https://raw.githubusercontent.com/ptsiogas4/AspectRatioLayout/master/Screenshots/screenshot2.png)

### Building
=======================
Fork the repository and include the 'library' module and you are done :)
AAR File coming to soon to maven central near you ;)

Or use JitPack: https://jitpack.io/#ptsiogas4/AspectRatioLayout

```
repositories {
    maven { url 'https://jitpack.io' }
}
    compile 'com.github.ptsiogas4:AspectRatioLayout:1.0.0'
```

## AspectRatioLayout java sample code
```java
RatioLinearLayout ratioLinearLayout = ...
ratioLinearLayout.setAspectRatio(2);
```

## Attributes

<table>
	<tbody>
		<tr>
			<td><em>Attribute</em></td>
			<td><em>Description</em></td>
		</tr>
		<tr>
			<td>aspectRatio</td>
			<td>This parameter indicates the proportion of the size Height or Width. Default is Width</td>
		</tr>
		<tr>
			<td>ratioType</td>
			<td>This parameter indicates that the ratio is calculated byWidth Or byHeight. Default is byWidth</td>
		</tr>
	</tbody>
</table>

## Supporting Views
 <ul>
   	<li><a href='javascript:'>RatioLinearLayout</a></li>
    <li><a href='javascript:'>RatioFrameLayout</a></li>
    <li><a href='javascript:'>RatioRelativeLayout</a></li>
    <li><a href='javascript:'>RatioGridLayout</a></li>
    <li><a href='javascript:'>RatioImageButton</a></li>
	<li><a href='javascript:'>RatioImageView</a></li>
    <li><a href='javascript:'>RatioTextView</a></li>
	<li><a href='javascript:'>RatioGridView</a></li>
	<li><a href='javascript:'>RatioListView</a></li>
	<li><a href='javascript:'>RatioButton</a></li>
	<li><a href='javascript:'>RatioCheckBox</a></li>
	<li><a href='javascript:'>RatioCheckedTextView</a></li>
	<li><a href='javascript:'>RatioEditText</a></li>
	<li><a href='javascript:'>RatioProgressBar</a></li>
	<li><a href='javascript:'>RatioRadioButton</a></li>
	<li><a href='javascript:'>RatioRadioGroup</a></li>
 </ul>


## Developed by
  ptsiogas - <a href='javascript:'>ptsiogas@gmail.com</a>

## License
	Copyright [2017] ptsiogas

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
	