// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.apimanagement.ApiSchemaArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Schema Contract details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * ### ApiManagementCreateApiSchema
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var apiSchema = new ApiSchema(&#34;apiSchema&#34;, ApiSchemaArgs.builder()        
 *             .apiId(&#34;59d6bb8f1f7fab13dc67ec9b&#34;)
 *             .contentType(&#34;application/vnd.ms-azure-apim.xsd+xml&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .schemaId(&#34;ec12520d-9d48-4e7b-8f39-698ca2ac63f1&#34;)
 *             .serviceName(&#34;apimService1&#34;)
 *             .value(&#34;&#34;&#34;
 * &lt;s:schema elementFormDefault=&#34;qualified&#34; targetNamespace=&#34;http://ws.cdyne.com/WeatherWS/&#34; xmlns:tns=&#34;http://ws.cdyne.com/WeatherWS/&#34; xmlns:s=&#34;http://www.w3.org/2001/XMLSchema&#34; xmlns:soap12=&#34;http://schemas.xmlsoap.org/wsdl/soap12/&#34; xmlns:mime=&#34;http://schemas.xmlsoap.org/wsdl/mime/&#34; xmlns:soap=&#34;http://schemas.xmlsoap.org/wsdl/soap/&#34; xmlns:tm=&#34;http://microsoft.com/wsdl/mime/textMatching/&#34; xmlns:http=&#34;http://schemas.xmlsoap.org/wsdl/http/&#34; xmlns:soapenc=&#34;http://schemas.xmlsoap.org/soap/encoding/&#34; xmlns:wsdl=&#34;http://schemas.xmlsoap.org/wsdl/&#34; xmlns:apim-wsdltns=&#34;http://ws.cdyne.com/WeatherWS/&#34;&gt;
 *   &lt;s:element name=&#34;GetWeatherInformation&#34;&gt;
 *     &lt;s:complexType /&gt;
 *   &lt;/s:element&gt;
 *   &lt;s:element name=&#34;GetWeatherInformationResponse&#34;&gt;
 *     &lt;s:complexType&gt;
 *       &lt;s:sequence&gt;
 *         &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;GetWeatherInformationResult&#34; type=&#34;tns:ArrayOfWeatherDescription&#34; /&gt;
 *       &lt;/s:sequence&gt;
 *     &lt;/s:complexType&gt;
 *   &lt;/s:element&gt;
 *   &lt;s:complexType name=&#34;ArrayOfWeatherDescription&#34;&gt;
 *     &lt;s:sequence&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;unbounded&#34; name=&#34;WeatherDescription&#34; type=&#34;tns:WeatherDescription&#34; /&gt;
 *     &lt;/s:sequence&gt;
 *   &lt;/s:complexType&gt;
 *   &lt;s:complexType name=&#34;WeatherDescription&#34;&gt;
 *     &lt;s:sequence&gt;
 *       &lt;s:element minOccurs=&#34;1&#34; maxOccurs=&#34;1&#34; name=&#34;WeatherID&#34; type=&#34;s:short&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;Description&#34; type=&#34;s:string&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;PictureURL&#34; type=&#34;s:string&#34; /&gt;
 *     &lt;/s:sequence&gt;
 *   &lt;/s:complexType&gt;
 *   &lt;s:element name=&#34;GetCityForecastByZIP&#34;&gt;
 *     &lt;s:complexType&gt;
 *       &lt;s:sequence&gt;
 *         &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;ZIP&#34; type=&#34;s:string&#34; /&gt;
 *       &lt;/s:sequence&gt;
 *     &lt;/s:complexType&gt;
 *   &lt;/s:element&gt;
 *   &lt;s:element name=&#34;GetCityForecastByZIPResponse&#34;&gt;
 *     &lt;s:complexType&gt;
 *       &lt;s:sequence&gt;
 *         &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;GetCityForecastByZIPResult&#34; type=&#34;tns:ForecastReturn&#34; /&gt;
 *       &lt;/s:sequence&gt;
 *     &lt;/s:complexType&gt;
 *   &lt;/s:element&gt;
 *   &lt;s:complexType name=&#34;ForecastReturn&#34;&gt;
 *     &lt;s:sequence&gt;
 *       &lt;s:element minOccurs=&#34;1&#34; maxOccurs=&#34;1&#34; name=&#34;Success&#34; type=&#34;s:boolean&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;ResponseText&#34; type=&#34;s:string&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;State&#34; type=&#34;s:string&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;City&#34; type=&#34;s:string&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;WeatherStationCity&#34; type=&#34;s:string&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;ForecastResult&#34; type=&#34;tns:ArrayOfForecast&#34; /&gt;
 *     &lt;/s:sequence&gt;
 *   &lt;/s:complexType&gt;
 *   &lt;s:complexType name=&#34;ArrayOfForecast&#34;&gt;
 *     &lt;s:sequence&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;unbounded&#34; name=&#34;Forecast&#34; nillable=&#34;true&#34; type=&#34;tns:Forecast&#34; /&gt;
 *     &lt;/s:sequence&gt;
 *   &lt;/s:complexType&gt;
 *   &lt;s:complexType name=&#34;Forecast&#34;&gt;
 *     &lt;s:sequence&gt;
 *       &lt;s:element minOccurs=&#34;1&#34; maxOccurs=&#34;1&#34; name=&#34;Date&#34; type=&#34;s:dateTime&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;1&#34; maxOccurs=&#34;1&#34; name=&#34;WeatherID&#34; type=&#34;s:short&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;Desciption&#34; type=&#34;s:string&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;1&#34; maxOccurs=&#34;1&#34; name=&#34;Temperatures&#34; type=&#34;tns:temp&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;1&#34; maxOccurs=&#34;1&#34; name=&#34;ProbabilityOfPrecipiation&#34; type=&#34;tns:POP&#34; /&gt;
 *     &lt;/s:sequence&gt;
 *   &lt;/s:complexType&gt;
 *   &lt;s:complexType name=&#34;temp&#34;&gt;
 *     &lt;s:sequence&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;MorningLow&#34; type=&#34;s:string&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;DaytimeHigh&#34; type=&#34;s:string&#34; /&gt;
 *     &lt;/s:sequence&gt;
 *   &lt;/s:complexType&gt;
 *   &lt;s:complexType name=&#34;POP&#34;&gt;
 *     &lt;s:sequence&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;Nighttime&#34; type=&#34;s:string&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;Daytime&#34; type=&#34;s:string&#34; /&gt;
 *     &lt;/s:sequence&gt;
 *   &lt;/s:complexType&gt;
 *   &lt;s:element name=&#34;GetCityWeatherByZIP&#34;&gt;
 *     &lt;s:complexType&gt;
 *       &lt;s:sequence&gt;
 *         &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;ZIP&#34; type=&#34;s:string&#34; /&gt;
 *       &lt;/s:sequence&gt;
 *     &lt;/s:complexType&gt;
 *   &lt;/s:element&gt;
 *   &lt;s:element name=&#34;GetCityWeatherByZIPResponse&#34;&gt;
 *     &lt;s:complexType&gt;
 *       &lt;s:sequence&gt;
 *         &lt;s:element minOccurs=&#34;1&#34; maxOccurs=&#34;1&#34; name=&#34;GetCityWeatherByZIPResult&#34; type=&#34;tns:WeatherReturn&#34; /&gt;
 *       &lt;/s:sequence&gt;
 *     &lt;/s:complexType&gt;
 *   &lt;/s:element&gt;
 *   &lt;s:complexType name=&#34;WeatherReturn&#34;&gt;
 *     &lt;s:sequence&gt;
 *       &lt;s:element minOccurs=&#34;1&#34; maxOccurs=&#34;1&#34; name=&#34;Success&#34; type=&#34;s:boolean&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;ResponseText&#34; type=&#34;s:string&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;State&#34; type=&#34;s:string&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;City&#34; type=&#34;s:string&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;WeatherStationCity&#34; type=&#34;s:string&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;1&#34; maxOccurs=&#34;1&#34; name=&#34;WeatherID&#34; type=&#34;s:short&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;Description&#34; type=&#34;s:string&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;Temperature&#34; type=&#34;s:string&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;RelativeHumidity&#34; type=&#34;s:string&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;Wind&#34; type=&#34;s:string&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;Pressure&#34; type=&#34;s:string&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;Visibility&#34; type=&#34;s:string&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;WindChill&#34; type=&#34;s:string&#34; /&gt;
 *       &lt;s:element minOccurs=&#34;0&#34; maxOccurs=&#34;1&#34; name=&#34;Remarks&#34; type=&#34;s:string&#34; /&gt;
 *     &lt;/s:sequence&gt;
 *   &lt;/s:complexType&gt;
 *   &lt;s:element name=&#34;ArrayOfWeatherDescription&#34; nillable=&#34;true&#34; type=&#34;tns:ArrayOfWeatherDescription&#34; /&gt;
 *   &lt;s:element name=&#34;ForecastReturn&#34; nillable=&#34;true&#34; type=&#34;tns:ForecastReturn&#34; /&gt;
 *   &lt;s:element name=&#34;WeatherReturn&#34; type=&#34;tns:WeatherReturn&#34; /&gt;
 * &lt;/s:schema&gt;            &#34;&#34;&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:ApiSchema ec12520d-9d48-4e7b-8f39-698ca2ac63f1 /subscriptions/subid/resourcegroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/apis/59d6bb8f1f7fab13dc67ec9b/schemas/ec12520d-9d48-4e7b-8f39-698ca2ac63f1 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:ApiSchema")
public class ApiSchema extends com.pulumi.resources.CustomResource {
    /**
     * Must be a valid a media type used in a Content-Type header as defined in the RFC 2616. Media type of the schema document (e.g. application/json, application/xml). &lt;/br&gt; - `Swagger` Schema use `application/vnd.ms-azure-apim.swagger.definitions+json` &lt;/br&gt; - `WSDL` Schema use `application/vnd.ms-azure-apim.xsd+xml` &lt;/br&gt; - `OpenApi` Schema use `application/vnd.oai.openapi.components+json` &lt;/br&gt; - `WADL Schema` use `application/vnd.ms-azure-apim.wadl.grammars+xml`.
     * 
     */
    @Export(name="contentType", type=String.class, parameters={})
    private Output<String> contentType;

    /**
     * @return Must be a valid a media type used in a Content-Type header as defined in the RFC 2616. Media type of the schema document (e.g. application/json, application/xml). &lt;/br&gt; - `Swagger` Schema use `application/vnd.ms-azure-apim.swagger.definitions+json` &lt;/br&gt; - `WSDL` Schema use `application/vnd.ms-azure-apim.xsd+xml` &lt;/br&gt; - `OpenApi` Schema use `application/vnd.oai.openapi.components+json` &lt;/br&gt; - `WADL Schema` use `application/vnd.ms-azure-apim.wadl.grammars+xml`.
     * 
     */
    public Output<String> contentType() {
        return this.contentType;
    }
    /**
     * Types definitions. Used for Swagger/OpenAPI schemas only, null otherwise.
     * 
     */
    @Export(name="definitions", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> definitions;

    /**
     * @return Types definitions. Used for Swagger/OpenAPI schemas only, null otherwise.
     * 
     */
    public Output<Optional<Object>> definitions() {
        return Codegen.optional(this.definitions);
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Json escaped string defining the document representing the Schema. Used for schemas other than Swagger/OpenAPI.
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output</* @Nullable */ String> value;

    /**
     * @return Json escaped string defining the document representing the Schema. Used for schemas other than Swagger/OpenAPI.
     * 
     */
    public Output<Optional<String>> value() {
        return Codegen.optional(this.value);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiSchema(String name) {
        this(name, ApiSchemaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiSchema(String name, ApiSchemaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiSchema(String name, ApiSchemaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiSchema", name, args == null ? ApiSchemaArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiSchema(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiSchema", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:apimanagement/v20170301:ApiSchema").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180101:ApiSchema").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180601preview:ApiSchema").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20190101:ApiSchema").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201:ApiSchema").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201preview:ApiSchema").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20200601preview:ApiSchema").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20201201:ApiSchema").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210101preview:ApiSchema").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210401preview:ApiSchema").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210801:ApiSchema").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20211201preview:ApiSchema").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ApiSchema get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiSchema(name, id, options);
    }
}
