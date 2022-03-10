// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2RecordConditionResponse;
import java.util.Objects;


/**
 * Configuration to suppress records whose suppression conditions evaluate to true.
 * 
 */
public final class GooglePrivacyDlpV2RecordSuppressionResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2RecordSuppressionResponse Empty = new GooglePrivacyDlpV2RecordSuppressionResponse();

    /**
     * A condition that when it evaluates to true will result in the record being evaluated to be suppressed from the transformed content.
     * 
     */
    @InputImport(name="condition", required=true)
      private final GooglePrivacyDlpV2RecordConditionResponse condition;

    public GooglePrivacyDlpV2RecordConditionResponse getCondition() {
        return this.condition;
    }

    public GooglePrivacyDlpV2RecordSuppressionResponse(GooglePrivacyDlpV2RecordConditionResponse condition) {
        this.condition = Objects.requireNonNull(condition, "expected parameter 'condition' to be non-null");
    }

    private GooglePrivacyDlpV2RecordSuppressionResponse() {
        this.condition = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2RecordSuppressionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2RecordConditionResponse condition;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2RecordSuppressionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
        }

        public Builder condition(GooglePrivacyDlpV2RecordConditionResponse condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        public GooglePrivacyDlpV2RecordSuppressionResponse build() {
            return new GooglePrivacyDlpV2RecordSuppressionResponse(condition);
        }
    }
}
