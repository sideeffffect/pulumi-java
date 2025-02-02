// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudMlV1__DiskConfigResponse {
    /**
     * @return Size in GB of the boot disk (default is 100GB).
     * 
     */
    private final Integer bootDiskSizeGb;
    /**
     * @return Type of the boot disk (default is &#34;pd-ssd&#34;). Valid values: &#34;pd-ssd&#34; (Persistent Disk Solid State Drive) or &#34;pd-standard&#34; (Persistent Disk Hard Disk Drive).
     * 
     */
    private final String bootDiskType;

    @CustomType.Constructor
    private GoogleCloudMlV1__DiskConfigResponse(
        @CustomType.Parameter("bootDiskSizeGb") Integer bootDiskSizeGb,
        @CustomType.Parameter("bootDiskType") String bootDiskType) {
        this.bootDiskSizeGb = bootDiskSizeGb;
        this.bootDiskType = bootDiskType;
    }

    /**
     * @return Size in GB of the boot disk (default is 100GB).
     * 
     */
    public Integer bootDiskSizeGb() {
        return this.bootDiskSizeGb;
    }
    /**
     * @return Type of the boot disk (default is &#34;pd-ssd&#34;). Valid values: &#34;pd-ssd&#34; (Persistent Disk Solid State Drive) or &#34;pd-standard&#34; (Persistent Disk Hard Disk Drive).
     * 
     */
    public String bootDiskType() {
        return this.bootDiskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__DiskConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer bootDiskSizeGb;
        private String bootDiskType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__DiskConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootDiskSizeGb = defaults.bootDiskSizeGb;
    	      this.bootDiskType = defaults.bootDiskType;
        }

        public Builder bootDiskSizeGb(Integer bootDiskSizeGb) {
            this.bootDiskSizeGb = Objects.requireNonNull(bootDiskSizeGb);
            return this;
        }
        public Builder bootDiskType(String bootDiskType) {
            this.bootDiskType = Objects.requireNonNull(bootDiskType);
            return this;
        }        public GoogleCloudMlV1__DiskConfigResponse build() {
            return new GoogleCloudMlV1__DiskConfigResponse(bootDiskSizeGb, bootDiskType);
        }
    }
}
