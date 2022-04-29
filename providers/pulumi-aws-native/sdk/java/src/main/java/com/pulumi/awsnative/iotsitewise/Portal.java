// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.iotsitewise.PortalArgs;
import com.pulumi.awsnative.iotsitewise.outputs.AlarmsProperties;
import com.pulumi.awsnative.iotsitewise.outputs.PortalTag;
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
 * Resource schema for AWS::IoTSiteWise::Portal
 * 
 */
@ResourceType(type="aws-native:iotsitewise:Portal")
public class Portal extends CustomResource {
    /**
     * Contains the configuration information of an alarm created in an AWS IoT SiteWise Monitor portal. You can use the alarm to monitor an asset property and get notified when the asset property value is outside a specified range.
     * 
     */
    @Export(name="alarms", type=AlarmsProperties.class, parameters={})
    private Output</* @Nullable */ AlarmsProperties> alarms;

    /**
     * @return Contains the configuration information of an alarm created in an AWS IoT SiteWise Monitor portal. You can use the alarm to monitor an asset property and get notified when the asset property value is outside a specified range.
     * 
     */
    public Output<Optional<AlarmsProperties>> alarms() {
        return Codegen.optional(this.alarms);
    }
    /**
     * The email address that sends alarm notifications.
     * 
     */
    @Export(name="notificationSenderEmail", type=String.class, parameters={})
    private Output</* @Nullable */ String> notificationSenderEmail;

    /**
     * @return The email address that sends alarm notifications.
     * 
     */
    public Output<Optional<String>> notificationSenderEmail() {
        return Codegen.optional(this.notificationSenderEmail);
    }
    /**
     * The ARN of the portal, which has the following format.
     * 
     */
    @Export(name="portalArn", type=String.class, parameters={})
    private Output<String> portalArn;

    /**
     * @return The ARN of the portal, which has the following format.
     * 
     */
    public Output<String> portalArn() {
        return this.portalArn;
    }
    /**
     * The service to use to authenticate users to the portal. Choose from SSO or IAM. You can&#39;t change this value after you create a portal.
     * 
     */
    @Export(name="portalAuthMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> portalAuthMode;

    /**
     * @return The service to use to authenticate users to the portal. Choose from SSO or IAM. You can&#39;t change this value after you create a portal.
     * 
     */
    public Output<Optional<String>> portalAuthMode() {
        return Codegen.optional(this.portalAuthMode);
    }
    /**
     * The AWS SSO application generated client ID (used with AWS SSO APIs).
     * 
     */
    @Export(name="portalClientId", type=String.class, parameters={})
    private Output<String> portalClientId;

    /**
     * @return The AWS SSO application generated client ID (used with AWS SSO APIs).
     * 
     */
    public Output<String> portalClientId() {
        return this.portalClientId;
    }
    /**
     * The AWS administrator&#39;s contact email address.
     * 
     */
    @Export(name="portalContactEmail", type=String.class, parameters={})
    private Output<String> portalContactEmail;

    /**
     * @return The AWS administrator&#39;s contact email address.
     * 
     */
    public Output<String> portalContactEmail() {
        return this.portalContactEmail;
    }
    /**
     * A description for the portal.
     * 
     */
    @Export(name="portalDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> portalDescription;

    /**
     * @return A description for the portal.
     * 
     */
    public Output<Optional<String>> portalDescription() {
        return Codegen.optional(this.portalDescription);
    }
    /**
     * The ID of the portal.
     * 
     */
    @Export(name="portalId", type=String.class, parameters={})
    private Output<String> portalId;

    /**
     * @return The ID of the portal.
     * 
     */
    public Output<String> portalId() {
        return this.portalId;
    }
    /**
     * A friendly name for the portal.
     * 
     */
    @Export(name="portalName", type=String.class, parameters={})
    private Output<String> portalName;

    /**
     * @return A friendly name for the portal.
     * 
     */
    public Output<String> portalName() {
        return this.portalName;
    }
    /**
     * The public root URL for the AWS IoT AWS IoT SiteWise Monitor application portal.
     * 
     */
    @Export(name="portalStartUrl", type=String.class, parameters={})
    private Output<String> portalStartUrl;

    /**
     * @return The public root URL for the AWS IoT AWS IoT SiteWise Monitor application portal.
     * 
     */
    public Output<String> portalStartUrl() {
        return this.portalStartUrl;
    }
    /**
     * The ARN of a service role that allows the portal&#39;s users to access your AWS IoT SiteWise resources on your behalf.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The ARN of a service role that allows the portal&#39;s users to access your AWS IoT SiteWise resources on your behalf.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * A list of key-value pairs that contain metadata for the portal.
     * 
     */
    @Export(name="tags", type=List.class, parameters={PortalTag.class})
    private Output</* @Nullable */ List<PortalTag>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the portal.
     * 
     */
    public Output<Optional<List<PortalTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Portal(String name) {
        this(name, PortalArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Portal(String name, PortalArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Portal(String name, PortalArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:iotsitewise:Portal", name, args == null ? PortalArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Portal(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:iotsitewise:Portal", name, null, makeResourceOptions(options, id));
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
    public static Portal get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Portal(name, id, options);
    }
}
