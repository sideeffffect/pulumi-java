// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.licensemanager;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.licensemanager.LicenseArgs;
import com.pulumi.awsnative.licensemanager.outputs.LicenseConsumptionConfiguration;
import com.pulumi.awsnative.licensemanager.outputs.LicenseEntitlement;
import com.pulumi.awsnative.licensemanager.outputs.LicenseIssuerData;
import com.pulumi.awsnative.licensemanager.outputs.LicenseMetadata;
import com.pulumi.awsnative.licensemanager.outputs.LicenseValidityDateFormat;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::LicenseManager::License
 * 
 */
@ResourceType(type="aws-native:licensemanager:License")
public class License extends CustomResource {
    /**
     * Beneficiary of the license.
     * 
     */
    @Export(name="beneficiary", type=String.class, parameters={})
    private Output</* @Nullable */ String> beneficiary;

    /**
     * @return Beneficiary of the license.
     * 
     */
    public Output<Optional<String>> beneficiary() {
        return Codegen.optional(this.beneficiary);
    }
    @Export(name="consumptionConfiguration", type=LicenseConsumptionConfiguration.class, parameters={})
    private Output<LicenseConsumptionConfiguration> consumptionConfiguration;

    public Output<LicenseConsumptionConfiguration> consumptionConfiguration() {
        return this.consumptionConfiguration;
    }
    @Export(name="entitlements", type=List.class, parameters={LicenseEntitlement.class})
    private Output<List<LicenseEntitlement>> entitlements;

    public Output<List<LicenseEntitlement>> entitlements() {
        return this.entitlements;
    }
    /**
     * Home region for the created license.
     * 
     */
    @Export(name="homeRegion", type=String.class, parameters={})
    private Output<String> homeRegion;

    /**
     * @return Home region for the created license.
     * 
     */
    public Output<String> homeRegion() {
        return this.homeRegion;
    }
    @Export(name="issuer", type=LicenseIssuerData.class, parameters={})
    private Output<LicenseIssuerData> issuer;

    public Output<LicenseIssuerData> issuer() {
        return this.issuer;
    }
    /**
     * Amazon Resource Name is a unique name for each resource.
     * 
     */
    @Export(name="licenseArn", type=String.class, parameters={})
    private Output<String> licenseArn;

    /**
     * @return Amazon Resource Name is a unique name for each resource.
     * 
     */
    public Output<String> licenseArn() {
        return this.licenseArn;
    }
    @Export(name="licenseMetadata", type=List.class, parameters={LicenseMetadata.class})
    private Output</* @Nullable */ List<LicenseMetadata>> licenseMetadata;

    public Output<Optional<List<LicenseMetadata>>> licenseMetadata() {
        return Codegen.optional(this.licenseMetadata);
    }
    /**
     * Name for the created license.
     * 
     */
    @Export(name="licenseName", type=String.class, parameters={})
    private Output<String> licenseName;

    /**
     * @return Name for the created license.
     * 
     */
    public Output<String> licenseName() {
        return this.licenseName;
    }
    /**
     * Product name for the created license.
     * 
     */
    @Export(name="productName", type=String.class, parameters={})
    private Output<String> productName;

    /**
     * @return Product name for the created license.
     * 
     */
    public Output<String> productName() {
        return this.productName;
    }
    /**
     * ProductSKU of the license.
     * 
     */
    @Export(name="productSKU", type=String.class, parameters={})
    private Output</* @Nullable */ String> productSKU;

    /**
     * @return ProductSKU of the license.
     * 
     */
    public Output<Optional<String>> productSKU() {
        return Codegen.optional(this.productSKU);
    }
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    public Output<Optional<String>> status() {
        return Codegen.optional(this.status);
    }
    @Export(name="validity", type=LicenseValidityDateFormat.class, parameters={})
    private Output<LicenseValidityDateFormat> validity;

    public Output<LicenseValidityDateFormat> validity() {
        return this.validity;
    }
    /**
     * The version of the license.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The version of the license.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public License(String name) {
        this(name, LicenseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public License(String name, LicenseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public License(String name, LicenseArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:licensemanager:License", name, args == null ? LicenseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private License(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:licensemanager:License", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static License get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new License(name, id, options);
    }
}
