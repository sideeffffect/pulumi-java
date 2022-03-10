// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesAdditionalExtensionObjectIdArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs Empty = new CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs();

    /**
     * Indicates whether or not this extension is critical (i.e., if the client does not know how to
     * handle this extension, the client should consider this to be an error).
     * 
     */
    @InputImport(name="critical", required=true)
      private final Input<Boolean> critical;

    public Input<Boolean> getCritical() {
        return this.critical;
    }

    /**
     * Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    @InputImport(name="objectId", required=true)
      private final Input<CaPoolIssuancePolicyBaselineValuesAdditionalExtensionObjectIdArgs> objectId;

    public Input<CaPoolIssuancePolicyBaselineValuesAdditionalExtensionObjectIdArgs> getObjectId() {
        return this.objectId;
    }

    /**
     * The value of this X.509 extension. A base64-encoded string.
     * 
     */
    @InputImport(name="value", required=true)
      private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs(
        Input<Boolean> critical,
        Input<CaPoolIssuancePolicyBaselineValuesAdditionalExtensionObjectIdArgs> objectId,
        Input<String> value) {
        this.critical = Objects.requireNonNull(critical, "expected parameter 'critical' to be non-null");
        this.objectId = Objects.requireNonNull(objectId, "expected parameter 'objectId' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs() {
        this.critical = Input.empty();
        this.objectId = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> critical;
        private Input<CaPoolIssuancePolicyBaselineValuesAdditionalExtensionObjectIdArgs> objectId;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.critical = defaults.critical;
    	      this.objectId = defaults.objectId;
    	      this.value = defaults.value;
        }

        public Builder critical(Input<Boolean> critical) {
            this.critical = Objects.requireNonNull(critical);
            return this;
        }

        public Builder critical(Boolean critical) {
            this.critical = Input.of(Objects.requireNonNull(critical));
            return this;
        }

        public Builder objectId(Input<CaPoolIssuancePolicyBaselineValuesAdditionalExtensionObjectIdArgs> objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }

        public Builder objectId(CaPoolIssuancePolicyBaselineValuesAdditionalExtensionObjectIdArgs objectId) {
            this.objectId = Input.of(Objects.requireNonNull(objectId));
            return this;
        }

        public Builder value(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder value(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs build() {
            return new CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs(critical, objectId, value);
        }
    }
}
