// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.certificatemanager;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.certificatemanager.AccountArgs;
import com.pulumi.awsnative.certificatemanager.outputs.AccountExpiryEventsConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::CertificateManager::Account.
 * 
 */
@ResourceType(type="aws-native:certificatemanager:Account")
public class Account extends com.pulumi.resources.CustomResource {
    @Export(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }
    @Export(name="expiryEventsConfiguration", type=AccountExpiryEventsConfiguration.class, parameters={})
    private Output<AccountExpiryEventsConfiguration> expiryEventsConfiguration;

    public Output<AccountExpiryEventsConfiguration> expiryEventsConfiguration() {
        return this.expiryEventsConfiguration;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Account(String name) {
        this(name, AccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Account(String name, AccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Account(String name, AccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:certificatemanager:Account", name, args == null ? AccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Account(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:certificatemanager:Account", name, null, makeResourceOptions(options, id));
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
    public static Account get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Account(name, id, options);
    }
}
