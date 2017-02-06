/*
 *  ----------------------------------------------------------------------------
 *  Copyright (C) 2016      European Space Agency
 *                          European Space Operations Centre
 *                          Darmstadt
 *                          Germany
 *  ----------------------------------------------------------------------------
 *  System                : ESA NanoSat MO Framework
 *  ----------------------------------------------------------------------------
 *  Licensed under the European Space Agency Public License, Version 2.0
 *  You may not use this file except in compliance with the License.
 * 
 *  Except as expressly set forth in this License, the Software is provided to
 *  You on an "as is" basis and without warranties of any kind, including without
 *  limitation merchantability, fitness for a particular purpose, absence of
 *  defects or errors, accuracy or non-infringement of intellectual property rights.
 *  
 *  See the License for the specific language governing permissions and
 *  limitations under the License. 
 *  ----------------------------------------------------------------------------
 */
package opssat.simulator.interfaces;

/**
 *
 * @author Cezar Suteu
 */
public interface ICamera{
/**
<pre>
High level command: file written to filesystem to request camera take a picture
Input parameters:int width,int height
Return parameters:byte[]
Size of returned parameters: 7962624
The width and height input parameters are in pixels.
</pre>
*/
byte[] takePicture(int width,int height);//3001
/**
<pre>
Simulator helper command: preload into memory a raw camera picture
Input parameters:String fileName
Return parameters:void
Size of returned parameters: 0
The filename of the raw picture. It is expected to be found in HOME/ops-sat-resources
</pre>
*/
void simPreloadPicture(String fileName);//3002



}
