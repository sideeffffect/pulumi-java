// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.signer;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.signer.SigningProfileArgs;
import com.pulumi.aws.signer.inputs.SigningProfileState;
import com.pulumi.aws.signer.outputs.SigningProfileRevocationRecord;
import com.pulumi.aws.signer.outputs.SigningProfileSignatureValidityPeriod;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a Signer Signing Profile. A signing profile contains information about the code signing configuration parameters that can be used by a given code signing user.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Signer signing profiles can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:signer/signingProfile:SigningProfile test_signer_signing_profile test_sp_DdW3Mk1foYL88fajut4mTVFGpuwfd4ACO6ANL0D1uIj7lrn8adK
 * ```
 * 
 */
@ResourceType(type="aws:signer/signingProfile:SigningProfile")
public class SigningProfile extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) for the signing profile.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) for the signing profile.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A unique signing profile name. By default generated by the provider. Signing profile names are immutable and cannot be reused after canceled.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique signing profile name. By default generated by the provider. Signing profile names are immutable and cannot be reused after canceled.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A signing profile name prefix. The provider will generate a unique suffix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> namePrefix;

    /**
     * @return A signing profile name prefix. The provider will generate a unique suffix. Conflicts with `name`.
     * 
     */
    public Output</* @Nullable */ String> namePrefix() {
        return this.namePrefix;
    }
    /**
     * A human-readable name for the signing platform associated with the signing profile.
     * 
     */
    @Export(name="platformDisplayName", type=String.class, parameters={})
    private Output<String> platformDisplayName;

    /**
     * @return A human-readable name for the signing platform associated with the signing profile.
     * 
     */
    public Output<String> platformDisplayName() {
        return this.platformDisplayName;
    }
    /**
     * The ID of the platform that is used by the target signing profile.
     * 
     */
    @Export(name="platformId", type=String.class, parameters={})
    private Output<String> platformId;

    /**
     * @return The ID of the platform that is used by the target signing profile.
     * 
     */
    public Output<String> platformId() {
        return this.platformId;
    }
    /**
     * Revocation information for a signing profile.
     * 
     */
    @Export(name="revocationRecords", type=List.class, parameters={SigningProfileRevocationRecord.class})
    private Output<List<SigningProfileRevocationRecord>> revocationRecords;

    /**
     * @return Revocation information for a signing profile.
     * 
     */
    public Output<List<SigningProfileRevocationRecord>> revocationRecords() {
        return this.revocationRecords;
    }
    /**
     * The validity period for a signing job.
     * 
     */
    @Export(name="signatureValidityPeriod", type=SigningProfileSignatureValidityPeriod.class, parameters={})
    private Output<SigningProfileSignatureValidityPeriod> signatureValidityPeriod;

    /**
     * @return The validity period for a signing job.
     * 
     */
    public Output<SigningProfileSignatureValidityPeriod> signatureValidityPeriod() {
        return this.signatureValidityPeriod;
    }
    /**
     * The status of the target signing profile.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the target signing profile.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A list of tags associated with the signing profile. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A list of tags associated with the signing profile. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The current version of the signing profile.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The current version of the signing profile.
     * 
     */
    public Output<String> version() {
        return this.version;
    }
    /**
     * The signing profile ARN, including the profile version.
     * 
     */
    @Export(name="versionArn", type=String.class, parameters={})
    private Output<String> versionArn;

    /**
     * @return The signing profile ARN, including the profile version.
     * 
     */
    public Output<String> versionArn() {
        return this.versionArn;
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
    public SigningProfile(String name, SigningProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:signer/signingProfile:SigningProfile", name, args == null ? SigningProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SigningProfile(String name, Output<String> id, @Nullable SigningProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:signer/signingProfile:SigningProfile", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SigningProfile get(String name, Output<String> id, @Nullable SigningProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SigningProfile(name, id, state, options);
    }
}
