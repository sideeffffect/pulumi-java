// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2BigQueryTableResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2FieldIdResponse;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2BigQueryFieldResponse {
    /**
     * Designated field in the BigQuery table.
     * 
     */
    private final GooglePrivacyDlpV2FieldIdResponse field;
    /**
     * Source table of the field.
     * 
     */
    private final GooglePrivacyDlpV2BigQueryTableResponse table;

    @OutputCustomType.Constructor({"field","table"})
    private GooglePrivacyDlpV2BigQueryFieldResponse(
        GooglePrivacyDlpV2FieldIdResponse field,
        GooglePrivacyDlpV2BigQueryTableResponse table) {
        this.field = field;
        this.table = table;
    }

    /**
     * Designated field in the BigQuery table.
     * 
    */
    public GooglePrivacyDlpV2FieldIdResponse getField() {
        return this.field;
    }
    /**
     * Source table of the field.
     * 
    */
    public GooglePrivacyDlpV2BigQueryTableResponse getTable() {
        return this.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2BigQueryFieldResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2FieldIdResponse field;
        private GooglePrivacyDlpV2BigQueryTableResponse table;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2BigQueryFieldResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.table = defaults.table;
        }

        public Builder setField(GooglePrivacyDlpV2FieldIdResponse field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }

        public Builder setTable(GooglePrivacyDlpV2BigQueryTableResponse table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }
        public GooglePrivacyDlpV2BigQueryFieldResponse build() {
            return new GooglePrivacyDlpV2BigQueryFieldResponse(field, table);
        }
    }
}
