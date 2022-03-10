// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAssetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAssetArgs Empty = new GetAssetArgs();

    /**
     * The ID of the asset
     * 
     */
    @InputImport(name="assetId", required=true)
      private final String assetId;

    public String getAssetId() {
        return this.assetId;
    }

    public GetAssetArgs(String assetId) {
        this.assetId = Objects.requireNonNull(assetId, "expected parameter 'assetId' to be non-null");
    }

    private GetAssetArgs() {
        this.assetId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetId = defaults.assetId;
        }

        public Builder assetId(String assetId) {
            this.assetId = Objects.requireNonNull(assetId);
            return this;
        }
        public GetAssetArgs build() {
            return new GetAssetArgs(assetId);
        }
    }
}
