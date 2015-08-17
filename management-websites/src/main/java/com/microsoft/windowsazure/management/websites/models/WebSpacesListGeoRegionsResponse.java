/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.websites.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;
import java.util.Iterator;

/**
* The List Geo Regions operation response.
*/
public class WebSpacesListGeoRegionsResponse extends OperationResponse implements Iterable<WebSpacesListGeoRegionsResponse.GeoRegion> {
    private ArrayList<WebSpacesListGeoRegionsResponse.GeoRegion> geoRegions;
    
    /**
    * Optional. The available geo regions.
    * @return The GeoRegions value.
    */
    public ArrayList<WebSpacesListGeoRegionsResponse.GeoRegion> getGeoRegions() {
        return this.geoRegions;
    }
    
    /**
    * Optional. The available geo regions.
    * @param geoRegionsValue The GeoRegions value.
    */
    public void setGeoRegions(final ArrayList<WebSpacesListGeoRegionsResponse.GeoRegion> geoRegionsValue) {
        this.geoRegions = geoRegionsValue;
    }
    
    /**
    * Initializes a new instance of the WebSpacesListGeoRegionsResponse class.
    *
    */
    public WebSpacesListGeoRegionsResponse() {
        super();
        this.setGeoRegions(new ArrayList<WebSpacesListGeoRegionsResponse.GeoRegion>());
    }
    
    /**
    * Gets the sequence of GeoRegions.
    *
    */
    public Iterator<WebSpacesListGeoRegionsResponse.GeoRegion> iterator() {
        return this.getGeoRegions().iterator();
    }
    
    /**
    * An available geo region for a web space.
    */
    public static class GeoRegion {
        private String description;
        
        /**
        * Optional. Description of the geo region.
        * @return The Description value.
        */
        public String getDescription() {
            return this.description;
        }
        
        /**
        * Optional. Description of the geo region.
        * @param descriptionValue The Description value.
        */
        public void setDescription(final String descriptionValue) {
            this.description = descriptionValue;
        }
        
        private String name;
        
        /**
        * Optional. Name of the geo region.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Optional. Name of the geo region.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        private Integer sortOrder;
        
        /**
        * Optional. Sort order for the geo region.
        * @return The SortOrder value.
        */
        public Integer getSortOrder() {
            return this.sortOrder;
        }
        
        /**
        * Optional. Sort order for the geo region.
        * @param sortOrderValue The SortOrder value.
        */
        public void setSortOrder(final Integer sortOrderValue) {
            this.sortOrder = sortOrderValue;
        }
    }
}
