// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudchannel.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudchannel.v1.CustomerRepricingConfigArgs;
import com.pulumi.googlenative.cloudchannel.v1.outputs.GoogleCloudChannelV1RepricingConfigResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a CustomerRepricingConfig. Call this method to set modifications for a specific customer&#39;s bill. You can only create configs if the RepricingConfig.effective_invoice_month is a future month. If needed, you can create a config for the current month, with some restrictions. When creating a config for a future month, make sure there are no existing configs for that RepricingConfig.effective_invoice_month. The following restrictions are for creating configs in the current month. * This functionality is reserved for recovering from an erroneous config, and should not be used for regular business cases. * The new config will not modify exports used with other configs. Changes to the config may be immediate, but may take up to 24 hours. * There is a limit of ten configs for any RepricingConfig.EntitlementGranularity.entitlement or RepricingConfig.effective_invoice_month. * The contained CustomerRepricingConfig.repricing_config vaule must be different from the value used in the current config for a RepricingConfig.EntitlementGranularity.entitlement. Possible Error Codes: * PERMISSION_DENIED: If the account making the request and the account being queried are different. * INVALID_ARGUMENT: Missing or invalid required parameters in the request. Also displays if the updated config is for the current month or past months. * NOT_FOUND: The CustomerRepricingConfig specified does not exist or is not associated with the given account. * INTERNAL: Any non-user error related to technical issues in the backend. In this case, contact Cloud Channel support. Return Value: If successful, the updated CustomerRepricingConfig resource, otherwise returns an error.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:cloudchannel/v1:CustomerRepricingConfig")
public class CustomerRepricingConfig extends com.pulumi.resources.CustomResource {
    @Export(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }
    @Export(name="customerId", type=String.class, parameters={})
    private Output<String> customerId;

    public Output<String> customerId() {
        return this.customerId;
    }
    /**
     * Resource name of the CustomerRepricingConfig. Format: accounts/{account_id}/customers/{customer_id}/customerRepricingConfigs/{id}.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of the CustomerRepricingConfig. Format: accounts/{account_id}/customers/{customer_id}/customerRepricingConfigs/{id}.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The configuration for bill modifications made by a reseller before sending it to customers.
     * 
     */
    @Export(name="repricingConfig", type=GoogleCloudChannelV1RepricingConfigResponse.class, parameters={})
    private Output<GoogleCloudChannelV1RepricingConfigResponse> repricingConfig;

    /**
     * @return The configuration for bill modifications made by a reseller before sending it to customers.
     * 
     */
    public Output<GoogleCloudChannelV1RepricingConfigResponse> repricingConfig() {
        return this.repricingConfig;
    }
    /**
     * Timestamp of an update to the repricing rule. If `update_time` is after RepricingConfig.effective_invoice_month then it indicates this was set mid-month.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Timestamp of an update to the repricing rule. If `update_time` is after RepricingConfig.effective_invoice_month then it indicates this was set mid-month.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomerRepricingConfig(String name) {
        this(name, CustomerRepricingConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomerRepricingConfig(String name, CustomerRepricingConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomerRepricingConfig(String name, CustomerRepricingConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudchannel/v1:CustomerRepricingConfig", name, args == null ? CustomerRepricingConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomerRepricingConfig(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudchannel/v1:CustomerRepricingConfig", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static CustomerRepricingConfig get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomerRepricingConfig(name, id, options);
    }
}
