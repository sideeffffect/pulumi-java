// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2BigQueryTableResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2QuasiIdFieldResponse;
import java.util.List;
import java.util.Objects;


/**
 * An auxiliary table contains statistical information on the relative frequency of different quasi-identifiers values. It has one or several quasi-identifiers columns, and one column that indicates the relative frequency of each quasi-identifier tuple. If a tuple is present in the data but not in the auxiliary table, the corresponding relative frequency is assumed to be zero (and thus, the tuple is highly reidentifiable).
 * 
 */
public final class GooglePrivacyDlpV2AuxiliaryTableResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2AuxiliaryTableResponse Empty = new GooglePrivacyDlpV2AuxiliaryTableResponse();

    /**
     * Quasi-identifier columns.
     * 
     */
    @Import(name="quasiIds", required=true)
    private List<GooglePrivacyDlpV2QuasiIdFieldResponse> quasiIds;

    public List<GooglePrivacyDlpV2QuasiIdFieldResponse> quasiIds() {
        return this.quasiIds;
    }

    /**
     * The relative frequency column must contain a floating-point number between 0 and 1 (inclusive). Null values are assumed to be zero.
     * 
     */
    @Import(name="relativeFrequency", required=true)
    private GooglePrivacyDlpV2FieldIdResponse relativeFrequency;

    public GooglePrivacyDlpV2FieldIdResponse relativeFrequency() {
        return this.relativeFrequency;
    }

    /**
     * Auxiliary table location.
     * 
     */
    @Import(name="table", required=true)
    private GooglePrivacyDlpV2BigQueryTableResponse table;

    public GooglePrivacyDlpV2BigQueryTableResponse table() {
        return this.table;
    }

    private GooglePrivacyDlpV2AuxiliaryTableResponse() {}

    private GooglePrivacyDlpV2AuxiliaryTableResponse(GooglePrivacyDlpV2AuxiliaryTableResponse $) {
        this.quasiIds = $.quasiIds;
        this.relativeFrequency = $.relativeFrequency;
        this.table = $.table;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2AuxiliaryTableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2AuxiliaryTableResponse $;

        public Builder() {
            $ = new GooglePrivacyDlpV2AuxiliaryTableResponse();
        }

        public Builder(GooglePrivacyDlpV2AuxiliaryTableResponse defaults) {
            $ = new GooglePrivacyDlpV2AuxiliaryTableResponse(Objects.requireNonNull(defaults));
        }

        public Builder quasiIds(List<GooglePrivacyDlpV2QuasiIdFieldResponse> quasiIds) {
            $.quasiIds = quasiIds;
            return this;
        }

        public Builder quasiIds(GooglePrivacyDlpV2QuasiIdFieldResponse... quasiIds) {
            return quasiIds(List.of(quasiIds));
        }

        public Builder relativeFrequency(GooglePrivacyDlpV2FieldIdResponse relativeFrequency) {
            $.relativeFrequency = relativeFrequency;
            return this;
        }

        public Builder table(GooglePrivacyDlpV2BigQueryTableResponse table) {
            $.table = table;
            return this;
        }

        public GooglePrivacyDlpV2AuxiliaryTableResponse build() {
            $.quasiIds = Objects.requireNonNull($.quasiIds, "expected parameter 'quasiIds' to be non-null");
            $.relativeFrequency = Objects.requireNonNull($.relativeFrequency, "expected parameter 'relativeFrequency' to be non-null");
            $.table = Objects.requireNonNull($.table, "expected parameter 'table' to be non-null");
            return $;
        }
    }

}
