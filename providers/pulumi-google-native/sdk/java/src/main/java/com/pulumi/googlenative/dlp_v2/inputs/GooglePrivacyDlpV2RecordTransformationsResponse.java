// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldTransformationResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2RecordSuppressionResponse;
import java.util.List;
import java.util.Objects;


/**
 * A type of transformation that is applied over structured data such as a table.
 * 
 */
public final class GooglePrivacyDlpV2RecordTransformationsResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2RecordTransformationsResponse Empty = new GooglePrivacyDlpV2RecordTransformationsResponse();

    /**
     * Transform the record by applying various field transformations.
     * 
     */
    @Import(name="fieldTransformations", required=true)
    private List<GooglePrivacyDlpV2FieldTransformationResponse> fieldTransformations;

    public List<GooglePrivacyDlpV2FieldTransformationResponse> fieldTransformations() {
        return this.fieldTransformations;
    }

    /**
     * Configuration defining which records get suppressed entirely. Records that match any suppression rule are omitted from the output.
     * 
     */
    @Import(name="recordSuppressions", required=true)
    private List<GooglePrivacyDlpV2RecordSuppressionResponse> recordSuppressions;

    public List<GooglePrivacyDlpV2RecordSuppressionResponse> recordSuppressions() {
        return this.recordSuppressions;
    }

    private GooglePrivacyDlpV2RecordTransformationsResponse() {}

    private GooglePrivacyDlpV2RecordTransformationsResponse(GooglePrivacyDlpV2RecordTransformationsResponse $) {
        this.fieldTransformations = $.fieldTransformations;
        this.recordSuppressions = $.recordSuppressions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2RecordTransformationsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2RecordTransformationsResponse $;

        public Builder() {
            $ = new GooglePrivacyDlpV2RecordTransformationsResponse();
        }

        public Builder(GooglePrivacyDlpV2RecordTransformationsResponse defaults) {
            $ = new GooglePrivacyDlpV2RecordTransformationsResponse(Objects.requireNonNull(defaults));
        }

        public Builder fieldTransformations(List<GooglePrivacyDlpV2FieldTransformationResponse> fieldTransformations) {
            $.fieldTransformations = fieldTransformations;
            return this;
        }

        public Builder fieldTransformations(GooglePrivacyDlpV2FieldTransformationResponse... fieldTransformations) {
            return fieldTransformations(List.of(fieldTransformations));
        }

        public Builder recordSuppressions(List<GooglePrivacyDlpV2RecordSuppressionResponse> recordSuppressions) {
            $.recordSuppressions = recordSuppressions;
            return this;
        }

        public Builder recordSuppressions(GooglePrivacyDlpV2RecordSuppressionResponse... recordSuppressions) {
            return recordSuppressions(List.of(recordSuppressions));
        }

        public GooglePrivacyDlpV2RecordTransformationsResponse build() {
            $.fieldTransformations = Objects.requireNonNull($.fieldTransformations, "expected parameter 'fieldTransformations' to be non-null");
            $.recordSuppressions = Objects.requireNonNull($.recordSuppressions, "expected parameter 'recordSuppressions' to be non-null");
            return $;
        }
    }

}
