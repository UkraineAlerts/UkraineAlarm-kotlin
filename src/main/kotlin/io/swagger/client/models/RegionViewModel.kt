/**
 * Ukraine Alert API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0
 * Contact: support@stfalcon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.models

import io.swagger.client.models.RegionViewModel
import io.swagger.client.models.V2RegionType

/**
 * 
 * @param regionId 
 * @param regionName 
 * @param regionType 
 * @param regionChildIds 
 */
data class RegionViewModel (

    val regionId: kotlin.String? = null,
    val regionName: kotlin.String? = null,
    val regionType: V2RegionType? = null,
    val regionChildIds: kotlin.Array<RegionViewModel>? = null
) {
}