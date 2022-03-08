// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2InfoTypeResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2InfoTypeStatsResponse {
    /**
     * Number of findings for this infoType.
     * 
     */
    private final String count;
    /**
     * The type of finding this stat is for.
     * 
     */
    private final GooglePrivacyDlpV2InfoTypeResponse infoType;

    @OutputCustomType.Constructor({"count","infoType"})
    private GooglePrivacyDlpV2InfoTypeStatsResponse(
        String count,
        GooglePrivacyDlpV2InfoTypeResponse infoType) {
        this.count = count;
        this.infoType = infoType;
    }

    /**
     * Number of findings for this infoType.
     * 
    */
    public String getCount() {
        return this.count;
    }
    /**
     * The type of finding this stat is for.
     * 
    */
    public GooglePrivacyDlpV2InfoTypeResponse getInfoType() {
        return this.infoType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2InfoTypeStatsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String count;
        private GooglePrivacyDlpV2InfoTypeResponse infoType;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2InfoTypeStatsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.infoType = defaults.infoType;
        }

        public Builder setCount(String count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setInfoType(GooglePrivacyDlpV2InfoTypeResponse infoType) {
            this.infoType = Objects.requireNonNull(infoType);
            return this;
        }
        public GooglePrivacyDlpV2InfoTypeStatsResponse build() {
            return new GooglePrivacyDlpV2InfoTypeStatsResponse(count, infoType);
        }
    }
}
