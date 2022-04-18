// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.kms.CryptoKeyArgs;
import com.pulumi.gcp.kms.inputs.CryptoKeyState;
import com.pulumi.gcp.kms.outputs.CryptoKeyVersionTemplate;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A `CryptoKey` represents a logical key that can be used for cryptographic operations.
 * 
 * > **Note:** CryptoKeys cannot be deleted from Google Cloud Platform.
 * Destroying a provider-managed CryptoKey will remove it from state
 * and delete all CryptoKeyVersions, rendering the key unusable, but *will
 * not delete the resource from the project.* When the provider destroys these keys,
 * any data previously encrypted with these keys will be irrecoverable.
 * For this reason, it is strongly recommended that you add lifecycle hooks
 * to the resource to prevent accidental destruction.
 * 
 * To get more information about CryptoKey, see:
 * 
 * * [API documentation](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys)
 * * How-to Guides
 *     * [Creating a key](https://cloud.google.com/kms/docs/creating-keys#create_a_key)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CryptoKey can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:kms/cryptoKey:CryptoKey default {{key_ring}}/cryptoKeys/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:kms/cryptoKey:CryptoKey default {{key_ring}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:kms/cryptoKey:CryptoKey")
public class CryptoKey extends com.pulumi.resources.CustomResource {
    /**
     * The period of time that versions of this key spend in the DESTROY_SCHEDULED state before transitioning to DESTROYED.
     * If not specified at creation time, the default duration is 24 hours.
     * 
     */
    @Export(name="destroyScheduledDuration", type=String.class, parameters={})
    private Output<String> destroyScheduledDuration;

    /**
     * @return The period of time that versions of this key spend in the DESTROY_SCHEDULED state before transitioning to DESTROYED.
     * If not specified at creation time, the default duration is 24 hours.
     * 
     */
    public Output<String> destroyScheduledDuration() {
        return this.destroyScheduledDuration;
    }
    /**
     * Whether this key may contain imported versions only.
     * 
     */
    @Export(name="importOnly", type=Boolean.class, parameters={})
    private Output<Boolean> importOnly;

    /**
     * @return Whether this key may contain imported versions only.
     * 
     */
    public Output<Boolean> importOnly() {
        return this.importOnly;
    }
    /**
     * The KeyRing that this key belongs to.
     * Format: `'projects/{{project}}/locations/{{location}}/keyRings/{{keyRing}}'`.
     * 
     */
    @Export(name="keyRing", type=String.class, parameters={})
    private Output<String> keyRing;

    /**
     * @return The KeyRing that this key belongs to.
     * Format: `'projects/{{project}}/locations/{{location}}/keyRings/{{keyRing}}'`.
     * 
     */
    public Output<String> keyRing() {
        return this.keyRing;
    }
    /**
     * Labels with user-defined metadata to apply to this resource.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Labels with user-defined metadata to apply to this resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The resource name for the CryptoKey.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for the CryptoKey.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The immutable purpose of this CryptoKey. See the
     * [purpose reference](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys#CryptoKeyPurpose)
     * for possible inputs.
     * Default value is `ENCRYPT_DECRYPT`.
     * Possible values are `ENCRYPT_DECRYPT`, `ASYMMETRIC_SIGN`, and `ASYMMETRIC_DECRYPT`.
     * 
     */
    @Export(name="purpose", type=String.class, parameters={})
    private Output</* @Nullable */ String> purpose;

    /**
     * @return The immutable purpose of this CryptoKey. See the
     * [purpose reference](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys#CryptoKeyPurpose)
     * for possible inputs.
     * Default value is `ENCRYPT_DECRYPT`.
     * Possible values are `ENCRYPT_DECRYPT`, `ASYMMETRIC_SIGN`, and `ASYMMETRIC_DECRYPT`.
     * 
     */
    public Output</* @Nullable */ String> purpose() {
        return this.purpose;
    }
    /**
     * Every time this period passes, generate a new CryptoKeyVersion and set it as the primary.
     * The first rotation will take place after the specified period. The rotation period has
     * the format of a decimal number with up to 9 fractional digits, followed by the
     * letter `s` (seconds). It must be greater than a day (ie, 86400).
     * 
     */
    @Export(name="rotationPeriod", type=String.class, parameters={})
    private Output</* @Nullable */ String> rotationPeriod;

    /**
     * @return Every time this period passes, generate a new CryptoKeyVersion and set it as the primary.
     * The first rotation will take place after the specified period. The rotation period has
     * the format of a decimal number with up to 9 fractional digits, followed by the
     * letter `s` (seconds). It must be greater than a day (ie, 86400).
     * 
     */
    public Output</* @Nullable */ String> rotationPeriod() {
        return this.rotationPeriod;
    }
    /**
     * If set to true, the request will create a CryptoKey without any CryptoKeyVersions.
     * You must use the `gcp.kms.KeyRingImportJob` resource to import the CryptoKeyVersion.
     * 
     */
    @Export(name="skipInitialVersionCreation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> skipInitialVersionCreation;

    /**
     * @return If set to true, the request will create a CryptoKey without any CryptoKeyVersions.
     * You must use the `gcp.kms.KeyRingImportJob` resource to import the CryptoKeyVersion.
     * 
     */
    public Output</* @Nullable */ Boolean> skipInitialVersionCreation() {
        return this.skipInitialVersionCreation;
    }
    /**
     * A template describing settings for new crypto key versions.
     * Structure is documented below.
     * 
     */
    @Export(name="versionTemplate", type=CryptoKeyVersionTemplate.class, parameters={})
    private Output<CryptoKeyVersionTemplate> versionTemplate;

    /**
     * @return A template describing settings for new crypto key versions.
     * Structure is documented below.
     * 
     */
    public Output<CryptoKeyVersionTemplate> versionTemplate() {
        return this.versionTemplate;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CryptoKey(String name) {
        this(name, CryptoKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CryptoKey(String name, CryptoKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CryptoKey(String name, CryptoKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:kms/cryptoKey:CryptoKey", name, args == null ? CryptoKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CryptoKey(String name, Output<String> id, @Nullable CryptoKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:kms/cryptoKey:CryptoKey", name, state, makeResourceOptions(options, id));
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
    public static CryptoKey get(String name, Output<String> id, @Nullable CryptoKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CryptoKey(name, id, state, options);
    }
}
