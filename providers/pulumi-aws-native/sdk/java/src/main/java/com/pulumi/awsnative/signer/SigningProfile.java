// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.signer;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.signer.SigningProfileArgs;
import com.pulumi.awsnative.signer.enums.SigningProfilePlatformId;
import com.pulumi.awsnative.signer.outputs.SigningProfileSignatureValidityPeriod;
import com.pulumi.awsnative.signer.outputs.SigningProfileTag;
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
 * A signing profile is a signing template that can be used to carry out a pre-defined signing job.
 * 
 */
@ResourceType(type="aws-native:signer:SigningProfile")
public class SigningProfile extends CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the specified signing profile.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the specified signing profile.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The ID of the target signing platform.
     * 
     */
    @Export(name="platformId", type=SigningProfilePlatformId.class, parameters={})
    private Output<SigningProfilePlatformId> platformId;

    /**
     * @return The ID of the target signing platform.
     * 
     */
    public Output<SigningProfilePlatformId> platformId() {
        return this.platformId;
    }
    /**
     * A name for the signing profile. AWS CloudFormation generates a unique physical ID and uses that ID for the signing profile name.
     * 
     */
    @Export(name="profileName", type=String.class, parameters={})
    private Output<String> profileName;

    /**
     * @return A name for the signing profile. AWS CloudFormation generates a unique physical ID and uses that ID for the signing profile name.
     * 
     */
    public Output<String> profileName() {
        return this.profileName;
    }
    /**
     * A version for the signing profile. AWS Signer generates a unique version for each profile of the same profile name.
     * 
     */
    @Export(name="profileVersion", type=String.class, parameters={})
    private Output<String> profileVersion;

    /**
     * @return A version for the signing profile. AWS Signer generates a unique version for each profile of the same profile name.
     * 
     */
    public Output<String> profileVersion() {
        return this.profileVersion;
    }
    /**
     * The Amazon Resource Name (ARN) of the specified signing profile version.
     * 
     */
    @Export(name="profileVersionArn", type=String.class, parameters={})
    private Output<String> profileVersionArn;

    /**
     * @return The Amazon Resource Name (ARN) of the specified signing profile version.
     * 
     */
    public Output<String> profileVersionArn() {
        return this.profileVersionArn;
    }
    /**
     * Signature validity period of the profile.
     * 
     */
    @Export(name="signatureValidityPeriod", type=SigningProfileSignatureValidityPeriod.class, parameters={})
    private Output</* @Nullable */ SigningProfileSignatureValidityPeriod> signatureValidityPeriod;

    /**
     * @return Signature validity period of the profile.
     * 
     */
    public Output<Optional<SigningProfileSignatureValidityPeriod>> signatureValidityPeriod() {
        return Codegen.optional(this.signatureValidityPeriod);
    }
    /**
     * A list of tags associated with the signing profile.
     * 
     */
    @Export(name="tags", type=List.class, parameters={SigningProfileTag.class})
    private Output</* @Nullable */ List<SigningProfileTag>> tags;

    /**
     * @return A list of tags associated with the signing profile.
     * 
     */
    public Output<Optional<List<SigningProfileTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SigningProfile(String name) {
        this(name, SigningProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SigningProfile(String name, SigningProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SigningProfile(String name, SigningProfileArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:signer:SigningProfile", name, args == null ? SigningProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SigningProfile(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:signer:SigningProfile", name, null, makeResourceOptions(options, id));
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
    public static SigningProfile get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new SigningProfile(name, id, options);
    }
}
