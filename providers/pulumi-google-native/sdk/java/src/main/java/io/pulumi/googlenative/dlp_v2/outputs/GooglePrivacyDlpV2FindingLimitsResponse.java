// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2InfoTypeLimitResponse;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2FindingLimitsResponse {
    /**
     * Configuration of findings limit given for specified infoTypes.
     * 
     */
    private final List<GooglePrivacyDlpV2InfoTypeLimitResponse> maxFindingsPerInfoType;
    /**
     * Max number of findings that will be returned for each item scanned. When set within `InspectJobConfig`, the maximum returned is 2000 regardless if this is set higher. When set within `InspectContentRequest`, this field is ignored.
     * 
     */
    private final Integer maxFindingsPerItem;
    /**
     * Max number of findings that will be returned per request/job. When set within `InspectContentRequest`, the maximum returned is 2000 regardless if this is set higher.
     * 
     */
    private final Integer maxFindingsPerRequest;

    @OutputCustomType.Constructor
    private GooglePrivacyDlpV2FindingLimitsResponse(
        @OutputCustomType.Parameter("maxFindingsPerInfoType") List<GooglePrivacyDlpV2InfoTypeLimitResponse> maxFindingsPerInfoType,
        @OutputCustomType.Parameter("maxFindingsPerItem") Integer maxFindingsPerItem,
        @OutputCustomType.Parameter("maxFindingsPerRequest") Integer maxFindingsPerRequest) {
        this.maxFindingsPerInfoType = maxFindingsPerInfoType;
        this.maxFindingsPerItem = maxFindingsPerItem;
        this.maxFindingsPerRequest = maxFindingsPerRequest;
    }

    /**
     * Configuration of findings limit given for specified infoTypes.
     * 
    */
    public List<GooglePrivacyDlpV2InfoTypeLimitResponse> getMaxFindingsPerInfoType() {
        return this.maxFindingsPerInfoType;
    }
    /**
     * Max number of findings that will be returned for each item scanned. When set within `InspectJobConfig`, the maximum returned is 2000 regardless if this is set higher. When set within `InspectContentRequest`, this field is ignored.
     * 
    */
    public Integer getMaxFindingsPerItem() {
        return this.maxFindingsPerItem;
    }
    /**
     * Max number of findings that will be returned per request/job. When set within `InspectContentRequest`, the maximum returned is 2000 regardless if this is set higher.
     * 
    */
    public Integer getMaxFindingsPerRequest() {
        return this.maxFindingsPerRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2FindingLimitsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2InfoTypeLimitResponse> maxFindingsPerInfoType;
        private Integer maxFindingsPerItem;
        private Integer maxFindingsPerRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2FindingLimitsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxFindingsPerInfoType = defaults.maxFindingsPerInfoType;
    	      this.maxFindingsPerItem = defaults.maxFindingsPerItem;
    	      this.maxFindingsPerRequest = defaults.maxFindingsPerRequest;
        }

        public Builder maxFindingsPerInfoType(List<GooglePrivacyDlpV2InfoTypeLimitResponse> maxFindingsPerInfoType) {
            this.maxFindingsPerInfoType = Objects.requireNonNull(maxFindingsPerInfoType);
            return this;
        }

        public Builder maxFindingsPerItem(Integer maxFindingsPerItem) {
            this.maxFindingsPerItem = Objects.requireNonNull(maxFindingsPerItem);
            return this;
        }

        public Builder maxFindingsPerRequest(Integer maxFindingsPerRequest) {
            this.maxFindingsPerRequest = Objects.requireNonNull(maxFindingsPerRequest);
            return this;
        }
        public GooglePrivacyDlpV2FindingLimitsResponse build() {
            return new GooglePrivacyDlpV2FindingLimitsResponse(maxFindingsPerInfoType, maxFindingsPerItem, maxFindingsPerRequest);
        }
    }
}
