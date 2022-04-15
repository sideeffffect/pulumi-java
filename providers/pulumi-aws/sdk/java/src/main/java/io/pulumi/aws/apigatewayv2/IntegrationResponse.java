// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.apigatewayv2.IntegrationResponseArgs;
import io.pulumi.aws.apigatewayv2.inputs.IntegrationResponseState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an Amazon API Gateway Version 2 integration response.
 * More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_apigatewayv2_integration_response` can be imported by using the API identifier, integration identifier and integration response identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigatewayv2/integrationResponse:IntegrationResponse example aabbccddee/1122334/998877
 * ```
 * 
 */
@ResourceType(type="aws:apigatewayv2/integrationResponse:IntegrationResponse")
public class IntegrationResponse extends io.pulumi.resources.CustomResource {
    /**
     * The API identifier.
     * 
     */
    @Export(name="apiId", type=String.class, parameters={})
    private Output<String> apiId;

    /**
     * @return The API identifier.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }
    /**
     * How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`.
     * 
     */
    @Export(name="contentHandlingStrategy", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentHandlingStrategy;

    /**
     * @return How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`.
     * 
     */
    public Output</* @Nullable */ String> contentHandlingStrategy() {
        return this.contentHandlingStrategy;
    }
    /**
     * The identifier of the `aws.apigatewayv2.Integration`.
     * 
     */
    @Export(name="integrationId", type=String.class, parameters={})
    private Output<String> integrationId;

    /**
     * @return The identifier of the `aws.apigatewayv2.Integration`.
     * 
     */
    public Output<String> integrationId() {
        return this.integrationId;
    }
    /**
     * The integration response key.
     * 
     */
    @Export(name="integrationResponseKey", type=String.class, parameters={})
    private Output<String> integrationResponseKey;

    /**
     * @return The integration response key.
     * 
     */
    public Output<String> integrationResponseKey() {
        return this.integrationResponseKey;
    }
    /**
     * A map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client.
     * 
     */
    @Export(name="responseTemplates", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> responseTemplates;

    /**
     * @return A map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> responseTemplates() {
        return this.responseTemplates;
    }
    /**
     * The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration response.
     * 
     */
    @Export(name="templateSelectionExpression", type=String.class, parameters={})
    private Output</* @Nullable */ String> templateSelectionExpression;

    /**
     * @return The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration response.
     * 
     */
    public Output</* @Nullable */ String> templateSelectionExpression() {
        return this.templateSelectionExpression;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IntegrationResponse(String name) {
        this(name, IntegrationResponseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationResponse(String name, IntegrationResponseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationResponse(String name, IntegrationResponseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/integrationResponse:IntegrationResponse", name, args == null ? IntegrationResponseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IntegrationResponse(String name, Output<String> id, @Nullable IntegrationResponseState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/integrationResponse:IntegrationResponse", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static IntegrationResponse get(String name, Output<String> id, @Nullable IntegrationResponseState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationResponse(name, id, state, options);
    }
}
