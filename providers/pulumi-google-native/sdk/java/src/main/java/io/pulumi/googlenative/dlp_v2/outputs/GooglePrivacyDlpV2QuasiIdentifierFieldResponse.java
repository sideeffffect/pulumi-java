// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2FieldIdResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2QuasiIdentifierFieldResponse {
    /**
     * A column can be tagged with a custom tag. In this case, the user must indicate an auxiliary table that contains statistical information on the possible values of this column (below).
     * 
     */
    private final String customTag;
    /**
     * Identifies the column.
     * 
     */
    private final GooglePrivacyDlpV2FieldIdResponse field;

    @OutputCustomType.Constructor({"customTag","field"})
    private GooglePrivacyDlpV2QuasiIdentifierFieldResponse(
        String customTag,
        GooglePrivacyDlpV2FieldIdResponse field) {
        this.customTag = customTag;
        this.field = field;
    }

    /**
     * A column can be tagged with a custom tag. In this case, the user must indicate an auxiliary table that contains statistical information on the possible values of this column (below).
     * 
    */
    public String getCustomTag() {
        return this.customTag;
    }
    /**
     * Identifies the column.
     * 
    */
    public GooglePrivacyDlpV2FieldIdResponse getField() {
        return this.field;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2QuasiIdentifierFieldResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String customTag;
        private GooglePrivacyDlpV2FieldIdResponse field;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2QuasiIdentifierFieldResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customTag = defaults.customTag;
    	      this.field = defaults.field;
        }

        public Builder setCustomTag(String customTag) {
            this.customTag = Objects.requireNonNull(customTag);
            return this;
        }

        public Builder setField(GooglePrivacyDlpV2FieldIdResponse field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }
        public GooglePrivacyDlpV2QuasiIdentifierFieldResponse build() {
            return new GooglePrivacyDlpV2QuasiIdentifierFieldResponse(customTag, field);
        }
    }
}
