// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2QuasiIdResponse;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2StatisticalTableResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse {
    /**
     * Several auxiliary tables can be used in the analysis. Each custom_tag used to tag a quasi-identifiers field must appear in exactly one field of one auxiliary table.
     * 
     */
    private final List<GooglePrivacyDlpV2StatisticalTableResponse> auxiliaryTables;
    /**
     * Fields considered to be quasi-identifiers. No two fields can have the same tag.
     * 
     */
    private final List<GooglePrivacyDlpV2QuasiIdResponse> quasiIds;
    /**
     * ISO 3166-1 alpha-2 region code to use in the statistical modeling. Set if no column is tagged with a region-specific InfoType (like US_ZIP_5) or a region code.
     * 
     */
    private final String regionCode;

    @CustomType.Constructor
    private GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse(
        @CustomType.Parameter("auxiliaryTables") List<GooglePrivacyDlpV2StatisticalTableResponse> auxiliaryTables,
        @CustomType.Parameter("quasiIds") List<GooglePrivacyDlpV2QuasiIdResponse> quasiIds,
        @CustomType.Parameter("regionCode") String regionCode) {
        this.auxiliaryTables = auxiliaryTables;
        this.quasiIds = quasiIds;
        this.regionCode = regionCode;
    }

    /**
     * Several auxiliary tables can be used in the analysis. Each custom_tag used to tag a quasi-identifiers field must appear in exactly one field of one auxiliary table.
     * 
    */
    public List<GooglePrivacyDlpV2StatisticalTableResponse> auxiliaryTables() {
        return this.auxiliaryTables;
    }
    /**
     * Fields considered to be quasi-identifiers. No two fields can have the same tag.
     * 
    */
    public List<GooglePrivacyDlpV2QuasiIdResponse> quasiIds() {
        return this.quasiIds;
    }
    /**
     * ISO 3166-1 alpha-2 region code to use in the statistical modeling. Set if no column is tagged with a region-specific InfoType (like US_ZIP_5) or a region code.
     * 
    */
    public String regionCode() {
        return this.regionCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2StatisticalTableResponse> auxiliaryTables;
        private List<GooglePrivacyDlpV2QuasiIdResponse> quasiIds;
        private String regionCode;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auxiliaryTables = defaults.auxiliaryTables;
    	      this.quasiIds = defaults.quasiIds;
    	      this.regionCode = defaults.regionCode;
        }

        public Builder auxiliaryTables(List<GooglePrivacyDlpV2StatisticalTableResponse> auxiliaryTables) {
            this.auxiliaryTables = Objects.requireNonNull(auxiliaryTables);
            return this;
        }
        public Builder auxiliaryTables(GooglePrivacyDlpV2StatisticalTableResponse... auxiliaryTables) {
            return auxiliaryTables(List.of(auxiliaryTables));
        }
        public Builder quasiIds(List<GooglePrivacyDlpV2QuasiIdResponse> quasiIds) {
            this.quasiIds = Objects.requireNonNull(quasiIds);
            return this;
        }
        public Builder quasiIds(GooglePrivacyDlpV2QuasiIdResponse... quasiIds) {
            return quasiIds(List.of(quasiIds));
        }
        public Builder regionCode(String regionCode) {
            this.regionCode = Objects.requireNonNull(regionCode);
            return this;
        }        public GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse build() {
            return new GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse(auxiliaryTables, quasiIds, regionCode);
        }
    }
}
