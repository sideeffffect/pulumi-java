// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.nimblestudio;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.nimblestudio.StudioArgs;
import com.pulumi.awsnative.nimblestudio.outputs.StudioEncryptionConfiguration;
import com.pulumi.awsnative.nimblestudio.outputs.StudioTags;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a studio that contains other Nimble Studio resources
 * 
 */
@ResourceType(type="aws-native:nimblestudio:Studio")
public class Studio extends CustomResource {
    /**
     * &lt;p&gt;The IAM role that Studio Admins will assume when logging in to the Nimble Studio portal.&lt;/p&gt;
     * 
     */
    @Export(name="adminRoleArn", type=String.class, parameters={})
    private Output<String> adminRoleArn;

    /**
     * @return &lt;p&gt;The IAM role that Studio Admins will assume when logging in to the Nimble Studio portal.&lt;/p&gt;
     * 
     */
    public Output<String> adminRoleArn() {
        return this.adminRoleArn;
    }
    /**
     * &lt;p&gt;A friendly name for the studio.&lt;/p&gt;
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return &lt;p&gt;A friendly name for the studio.&lt;/p&gt;
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * &lt;p&gt;The Amazon Web Services Region where the studio resource is located.&lt;/p&gt;
     * 
     */
    @Export(name="homeRegion", type=String.class, parameters={})
    private Output<String> homeRegion;

    /**
     * @return &lt;p&gt;The Amazon Web Services Region where the studio resource is located.&lt;/p&gt;
     * 
     */
    public Output<String> homeRegion() {
        return this.homeRegion;
    }
    /**
     * &lt;p&gt;The Amazon Web Services SSO application client ID used to integrate with Amazon Web Services SSO to enable Amazon Web Services SSO users to log in to Nimble Studio portal.&lt;/p&gt;
     * 
     */
    @Export(name="ssoClientId", type=String.class, parameters={})
    private Output<String> ssoClientId;

    /**
     * @return &lt;p&gt;The Amazon Web Services SSO application client ID used to integrate with Amazon Web Services SSO to enable Amazon Web Services SSO users to log in to Nimble Studio portal.&lt;/p&gt;
     * 
     */
    public Output<String> ssoClientId() {
        return this.ssoClientId;
    }
    @Export(name="studioEncryptionConfiguration", type=StudioEncryptionConfiguration.class, parameters={})
    private Output</* @Nullable */ StudioEncryptionConfiguration> studioEncryptionConfiguration;

    public Output<Optional<StudioEncryptionConfiguration>> studioEncryptionConfiguration() {
        return Codegen.optional(this.studioEncryptionConfiguration);
    }
    @Export(name="studioId", type=String.class, parameters={})
    private Output<String> studioId;

    public Output<String> studioId() {
        return this.studioId;
    }
    /**
     * &lt;p&gt;The studio name that is used in the URL of the Nimble Studio portal when accessed by Nimble Studio users.&lt;/p&gt;
     * 
     */
    @Export(name="studioName", type=String.class, parameters={})
    private Output<String> studioName;

    /**
     * @return &lt;p&gt;The studio name that is used in the URL of the Nimble Studio portal when accessed by Nimble Studio users.&lt;/p&gt;
     * 
     */
    public Output<String> studioName() {
        return this.studioName;
    }
    /**
     * &lt;p&gt;The address of the web page for the studio.&lt;/p&gt;
     * 
     */
    @Export(name="studioUrl", type=String.class, parameters={})
    private Output<String> studioUrl;

    /**
     * @return &lt;p&gt;The address of the web page for the studio.&lt;/p&gt;
     * 
     */
    public Output<String> studioUrl() {
        return this.studioUrl;
    }
    @Export(name="tags", type=StudioTags.class, parameters={})
    private Output</* @Nullable */ StudioTags> tags;

    public Output<Optional<StudioTags>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * &lt;p&gt;The IAM role that Studio Users will assume when logging in to the Nimble Studio portal.&lt;/p&gt;
     * 
     */
    @Export(name="userRoleArn", type=String.class, parameters={})
    private Output<String> userRoleArn;

    /**
     * @return &lt;p&gt;The IAM role that Studio Users will assume when logging in to the Nimble Studio portal.&lt;/p&gt;
     * 
     */
    public Output<String> userRoleArn() {
        return this.userRoleArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Studio(String name) {
        this(name, StudioArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Studio(String name, StudioArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Studio(String name, StudioArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:nimblestudio:Studio", name, args == null ? StudioArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Studio(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:nimblestudio:Studio", name, null, makeResourceOptions(options, id));
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
    public static Studio get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Studio(name, id, options);
    }
}
