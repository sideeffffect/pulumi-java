// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExternalKeyState extends io.pulumi.resources.ResourceArgs {

    public static final ExternalKeyState Empty = new ExternalKeyState();

    /**
     * The Amazon Resource Name (ARN) of the key.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Specifies whether to disable the policy lockout check performed when creating or updating the key's policy. Setting this value to `true` increases the risk that the key becomes unmanageable. For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the AWS Key Management Service Developer Guide. Defaults to `false`.
     * 
     */
    @Import(name="bypassPolicyLockoutSafetyCheck")
      private final @Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck;

    public Output<Boolean> bypassPolicyLockoutSafetyCheck() {
        return this.bypassPolicyLockoutSafetyCheck == null ? Codegen.empty() : this.bypassPolicyLockoutSafetyCheck;
    }

    /**
     * Duration in days after which the key is deleted after destruction of the resource. Must be between `7` and `30` days. Defaults to `30`.
     * 
     */
    @Import(name="deletionWindowInDays")
      private final @Nullable Output<Integer> deletionWindowInDays;

    public Output<Integer> deletionWindowInDays() {
        return this.deletionWindowInDays == null ? Codegen.empty() : this.deletionWindowInDays;
    }

    /**
     * Description of the key.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Specifies whether the key is enabled. Keys pending import can only be `false`. Imported keys default to `true` unless expired.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * Whether the key material expires. Empty when pending key material import, otherwise `KEY_MATERIAL_EXPIRES` or `KEY_MATERIAL_DOES_NOT_EXPIRE`.
     * 
     */
    @Import(name="expirationModel")
      private final @Nullable Output<String> expirationModel;

    public Output<String> expirationModel() {
        return this.expirationModel == null ? Codegen.empty() : this.expirationModel;
    }

    /**
     * Base64 encoded 256-bit symmetric encryption key material to import. The CMK is permanently associated with this key material. The same key material can be reimported, but you cannot import different key material.
     * 
     */
    @Import(name="keyMaterialBase64")
      private final @Nullable Output<String> keyMaterialBase64;

    public Output<String> keyMaterialBase64() {
        return this.keyMaterialBase64 == null ? Codegen.empty() : this.keyMaterialBase64;
    }

    /**
     * The state of the CMK.
     * 
     */
    @Import(name="keyState")
      private final @Nullable Output<String> keyState;

    public Output<String> keyState() {
        return this.keyState == null ? Codegen.empty() : this.keyState;
    }

    /**
     * The cryptographic operations for which you can use the CMK.
     * 
     */
    @Import(name="keyUsage")
      private final @Nullable Output<String> keyUsage;

    public Output<String> keyUsage() {
        return this.keyUsage == null ? Codegen.empty() : this.keyUsage;
    }

    /**
     * Indicates whether the KMS key is a multi-Region (`true`) or regional (`false`) key. Defaults to `false`.
     * 
     */
    @Import(name="multiRegion")
      private final @Nullable Output<Boolean> multiRegion;

    public Output<Boolean> multiRegion() {
        return this.multiRegion == null ? Codegen.empty() : this.multiRegion;
    }

    /**
     * A key policy JSON document. If you do not provide a key policy, AWS KMS attaches a default key policy to the CMK.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> policy() {
        return this.policy == null ? Codegen.empty() : this.policy;
    }

    /**
     * A key-value map of tags to assign to the key. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * Time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. If not specified, key material does not expire. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
     * 
     */
    @Import(name="validTo")
      private final @Nullable Output<String> validTo;

    public Output<String> validTo() {
        return this.validTo == null ? Codegen.empty() : this.validTo;
    }

    public ExternalKeyState(
        @Nullable Output<String> arn,
        @Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck,
        @Nullable Output<Integer> deletionWindowInDays,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> expirationModel,
        @Nullable Output<String> keyMaterialBase64,
        @Nullable Output<String> keyState,
        @Nullable Output<String> keyUsage,
        @Nullable Output<Boolean> multiRegion,
        @Nullable Output<String> policy,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> validTo) {
        this.arn = arn;
        this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
        this.deletionWindowInDays = deletionWindowInDays;
        this.description = description;
        this.enabled = enabled;
        this.expirationModel = expirationModel;
        this.keyMaterialBase64 = keyMaterialBase64;
        this.keyState = keyState;
        this.keyUsage = keyUsage;
        this.multiRegion = multiRegion;
        this.policy = policy;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.validTo = validTo;
    }

    private ExternalKeyState() {
        this.arn = Codegen.empty();
        this.bypassPolicyLockoutSafetyCheck = Codegen.empty();
        this.deletionWindowInDays = Codegen.empty();
        this.description = Codegen.empty();
        this.enabled = Codegen.empty();
        this.expirationModel = Codegen.empty();
        this.keyMaterialBase64 = Codegen.empty();
        this.keyState = Codegen.empty();
        this.keyUsage = Codegen.empty();
        this.multiRegion = Codegen.empty();
        this.policy = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.validTo = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck;
        private @Nullable Output<Integer> deletionWindowInDays;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> expirationModel;
        private @Nullable Output<String> keyMaterialBase64;
        private @Nullable Output<String> keyState;
        private @Nullable Output<String> keyUsage;
        private @Nullable Output<Boolean> multiRegion;
        private @Nullable Output<String> policy;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> validTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalKeyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.bypassPolicyLockoutSafetyCheck = defaults.bypassPolicyLockoutSafetyCheck;
    	      this.deletionWindowInDays = defaults.deletionWindowInDays;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.expirationModel = defaults.expirationModel;
    	      this.keyMaterialBase64 = defaults.keyMaterialBase64;
    	      this.keyState = defaults.keyState;
    	      this.keyUsage = defaults.keyUsage;
    	      this.multiRegion = defaults.multiRegion;
    	      this.policy = defaults.policy;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.validTo = defaults.validTo;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder bypassPolicyLockoutSafetyCheck(@Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck) {
            this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
            return this;
        }
        public Builder bypassPolicyLockoutSafetyCheck(@Nullable Boolean bypassPolicyLockoutSafetyCheck) {
            this.bypassPolicyLockoutSafetyCheck = Codegen.ofNullable(bypassPolicyLockoutSafetyCheck);
            return this;
        }
        public Builder deletionWindowInDays(@Nullable Output<Integer> deletionWindowInDays) {
            this.deletionWindowInDays = deletionWindowInDays;
            return this;
        }
        public Builder deletionWindowInDays(@Nullable Integer deletionWindowInDays) {
            this.deletionWindowInDays = Codegen.ofNullable(deletionWindowInDays);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder expirationModel(@Nullable Output<String> expirationModel) {
            this.expirationModel = expirationModel;
            return this;
        }
        public Builder expirationModel(@Nullable String expirationModel) {
            this.expirationModel = Codegen.ofNullable(expirationModel);
            return this;
        }
        public Builder keyMaterialBase64(@Nullable Output<String> keyMaterialBase64) {
            this.keyMaterialBase64 = keyMaterialBase64;
            return this;
        }
        public Builder keyMaterialBase64(@Nullable String keyMaterialBase64) {
            this.keyMaterialBase64 = Codegen.ofNullable(keyMaterialBase64);
            return this;
        }
        public Builder keyState(@Nullable Output<String> keyState) {
            this.keyState = keyState;
            return this;
        }
        public Builder keyState(@Nullable String keyState) {
            this.keyState = Codegen.ofNullable(keyState);
            return this;
        }
        public Builder keyUsage(@Nullable Output<String> keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }
        public Builder keyUsage(@Nullable String keyUsage) {
            this.keyUsage = Codegen.ofNullable(keyUsage);
            return this;
        }
        public Builder multiRegion(@Nullable Output<Boolean> multiRegion) {
            this.multiRegion = multiRegion;
            return this;
        }
        public Builder multiRegion(@Nullable Boolean multiRegion) {
            this.multiRegion = Codegen.ofNullable(multiRegion);
            return this;
        }
        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policy(@Nullable String policy) {
            this.policy = Codegen.ofNullable(policy);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder validTo(@Nullable Output<String> validTo) {
            this.validTo = validTo;
            return this;
        }
        public Builder validTo(@Nullable String validTo) {
            this.validTo = Codegen.ofNullable(validTo);
            return this;
        }        public ExternalKeyState build() {
            return new ExternalKeyState(arn, bypassPolicyLockoutSafetyCheck, deletionWindowInDays, description, enabled, expirationModel, keyMaterialBase64, keyState, keyUsage, multiRegion, policy, tags, tagsAll, validTo);
        }
    }
}
