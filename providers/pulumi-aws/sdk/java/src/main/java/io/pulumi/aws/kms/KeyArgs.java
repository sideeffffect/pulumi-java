// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyArgs Empty = new KeyArgs();

    /**
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to true indiscriminately.
     * For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the _AWS Key Management Service Developer Guide_.
     * The default value is `false`.
     * 
     */
    @InputImport(name="bypassPolicyLockoutSafetyCheck")
      private final @Nullable Input<Boolean> bypassPolicyLockoutSafetyCheck;

    public Input<Boolean> getBypassPolicyLockoutSafetyCheck() {
        return this.bypassPolicyLockoutSafetyCheck == null ? Input.empty() : this.bypassPolicyLockoutSafetyCheck;
    }

    /**
     * Specifies whether the key contains a symmetric key or an asymmetric key pair and the encryption algorithms or signing algorithms that the key supports.
     * Valid values: `SYMMETRIC_DEFAULT`,  `RSA_2048`, `RSA_3072`, `RSA_4096`, `ECC_NIST_P256`, `ECC_NIST_P384`, `ECC_NIST_P521`, or `ECC_SECG_P256K1`. Defaults to `SYMMETRIC_DEFAULT`. For help with choosing a key spec, see the [AWS KMS Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html).
     * 
     */
    @InputImport(name="customerMasterKeySpec")
      private final @Nullable Input<String> customerMasterKeySpec;

    public Input<String> getCustomerMasterKeySpec() {
        return this.customerMasterKeySpec == null ? Input.empty() : this.customerMasterKeySpec;
    }

    /**
     * The waiting period, specified in number of days. After the waiting period ends, AWS KMS deletes the KMS key.
     * If you specify a value, it must be between `7` and `30`, inclusive. If you do not specify a value, it defaults to `30`.
     * If the KMS key is a multi-Region primary key with replicas, the waiting period begins when the last of its replica keys is deleted. Otherwise, the waiting period begins immediately.
     * 
     */
    @InputImport(name="deletionWindowInDays")
      private final @Nullable Input<Integer> deletionWindowInDays;

    public Input<Integer> getDeletionWindowInDays() {
        return this.deletionWindowInDays == null ? Input.empty() : this.deletionWindowInDays;
    }

    /**
     * The description of the key as viewed in AWS console.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Specifies whether [key rotation](http://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html) is enabled. Defaults to false.
     * 
     */
    @InputImport(name="enableKeyRotation")
      private final @Nullable Input<Boolean> enableKeyRotation;

    public Input<Boolean> getEnableKeyRotation() {
        return this.enableKeyRotation == null ? Input.empty() : this.enableKeyRotation;
    }

    /**
     * Specifies whether the key is enabled. Defaults to `true`.
     * 
     */
    @InputImport(name="isEnabled")
      private final @Nullable Input<Boolean> isEnabled;

    public Input<Boolean> getIsEnabled() {
        return this.isEnabled == null ? Input.empty() : this.isEnabled;
    }

    /**
     * Specifies the intended use of the key. Valid values: `ENCRYPT_DECRYPT` or `SIGN_VERIFY`.
     * Defaults to `ENCRYPT_DECRYPT`.
     * 
     */
    @InputImport(name="keyUsage")
      private final @Nullable Input<String> keyUsage;

    public Input<String> getKeyUsage() {
        return this.keyUsage == null ? Input.empty() : this.keyUsage;
    }

    /**
     * Indicates whether the KMS key is a multi-Region (`true`) or regional (`false`) key. Defaults to `false`.
     * 
     */
    @InputImport(name="multiRegion")
      private final @Nullable Input<Boolean> multiRegion;

    public Input<Boolean> getMultiRegion() {
        return this.multiRegion == null ? Input.empty() : this.multiRegion;
    }

    /**
     * A valid policy JSON document. Although this is a key policy, not an IAM policy, an `aws.iam.getPolicyDocument`, in the form that designates a principal, can be used.
     * 
     */
    @InputImport(name="policy")
      private final @Nullable Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    /**
     * A map of tags to assign to the object. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public KeyArgs(
        @Nullable Input<Boolean> bypassPolicyLockoutSafetyCheck,
        @Nullable Input<String> customerMasterKeySpec,
        @Nullable Input<Integer> deletionWindowInDays,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> enableKeyRotation,
        @Nullable Input<Boolean> isEnabled,
        @Nullable Input<String> keyUsage,
        @Nullable Input<Boolean> multiRegion,
        @Nullable Input<String> policy,
        @Nullable Input<Map<String,String>> tags) {
        this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
        this.customerMasterKeySpec = customerMasterKeySpec;
        this.deletionWindowInDays = deletionWindowInDays;
        this.description = description;
        this.enableKeyRotation = enableKeyRotation;
        this.isEnabled = isEnabled;
        this.keyUsage = keyUsage;
        this.multiRegion = multiRegion;
        this.policy = policy;
        this.tags = tags;
    }

    private KeyArgs() {
        this.bypassPolicyLockoutSafetyCheck = Input.empty();
        this.customerMasterKeySpec = Input.empty();
        this.deletionWindowInDays = Input.empty();
        this.description = Input.empty();
        this.enableKeyRotation = Input.empty();
        this.isEnabled = Input.empty();
        this.keyUsage = Input.empty();
        this.multiRegion = Input.empty();
        this.policy = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> bypassPolicyLockoutSafetyCheck;
        private @Nullable Input<String> customerMasterKeySpec;
        private @Nullable Input<Integer> deletionWindowInDays;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> enableKeyRotation;
        private @Nullable Input<Boolean> isEnabled;
        private @Nullable Input<String> keyUsage;
        private @Nullable Input<Boolean> multiRegion;
        private @Nullable Input<String> policy;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bypassPolicyLockoutSafetyCheck = defaults.bypassPolicyLockoutSafetyCheck;
    	      this.customerMasterKeySpec = defaults.customerMasterKeySpec;
    	      this.deletionWindowInDays = defaults.deletionWindowInDays;
    	      this.description = defaults.description;
    	      this.enableKeyRotation = defaults.enableKeyRotation;
    	      this.isEnabled = defaults.isEnabled;
    	      this.keyUsage = defaults.keyUsage;
    	      this.multiRegion = defaults.multiRegion;
    	      this.policy = defaults.policy;
    	      this.tags = defaults.tags;
        }

        public Builder bypassPolicyLockoutSafetyCheck(@Nullable Input<Boolean> bypassPolicyLockoutSafetyCheck) {
            this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
            return this;
        }

        public Builder bypassPolicyLockoutSafetyCheck(@Nullable Boolean bypassPolicyLockoutSafetyCheck) {
            this.bypassPolicyLockoutSafetyCheck = Input.ofNullable(bypassPolicyLockoutSafetyCheck);
            return this;
        }

        public Builder customerMasterKeySpec(@Nullable Input<String> customerMasterKeySpec) {
            this.customerMasterKeySpec = customerMasterKeySpec;
            return this;
        }

        public Builder customerMasterKeySpec(@Nullable String customerMasterKeySpec) {
            this.customerMasterKeySpec = Input.ofNullable(customerMasterKeySpec);
            return this;
        }

        public Builder deletionWindowInDays(@Nullable Input<Integer> deletionWindowInDays) {
            this.deletionWindowInDays = deletionWindowInDays;
            return this;
        }

        public Builder deletionWindowInDays(@Nullable Integer deletionWindowInDays) {
            this.deletionWindowInDays = Input.ofNullable(deletionWindowInDays);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder enableKeyRotation(@Nullable Input<Boolean> enableKeyRotation) {
            this.enableKeyRotation = enableKeyRotation;
            return this;
        }

        public Builder enableKeyRotation(@Nullable Boolean enableKeyRotation) {
            this.enableKeyRotation = Input.ofNullable(enableKeyRotation);
            return this;
        }

        public Builder isEnabled(@Nullable Input<Boolean> isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        public Builder isEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = Input.ofNullable(isEnabled);
            return this;
        }

        public Builder keyUsage(@Nullable Input<String> keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }

        public Builder keyUsage(@Nullable String keyUsage) {
            this.keyUsage = Input.ofNullable(keyUsage);
            return this;
        }

        public Builder multiRegion(@Nullable Input<Boolean> multiRegion) {
            this.multiRegion = multiRegion;
            return this;
        }

        public Builder multiRegion(@Nullable Boolean multiRegion) {
            this.multiRegion = Input.ofNullable(multiRegion);
            return this;
        }

        public Builder policy(@Nullable Input<String> policy) {
            this.policy = policy;
            return this;
        }

        public Builder policy(@Nullable String policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public KeyArgs build() {
            return new KeyArgs(bypassPolicyLockoutSafetyCheck, customerMasterKeySpec, deletionWindowInDays, description, enableKeyRotation, isEnabled, keyUsage, multiRegion, policy, tags);
        }
    }
}
