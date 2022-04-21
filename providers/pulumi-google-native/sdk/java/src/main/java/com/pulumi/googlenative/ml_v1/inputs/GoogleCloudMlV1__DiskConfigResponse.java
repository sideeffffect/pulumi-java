// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Represents the config of disk options.
 * 
 */
public final class GoogleCloudMlV1__DiskConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__DiskConfigResponse Empty = new GoogleCloudMlV1__DiskConfigResponse();

    /**
     * Size in GB of the boot disk (default is 100GB).
     * 
     */
    @Import(name="bootDiskSizeGb", required=true)
    private Integer bootDiskSizeGb;

    public Integer bootDiskSizeGb() {
        return this.bootDiskSizeGb;
    }

    /**
     * Type of the boot disk (default is &#34;pd-ssd&#34;). Valid values: &#34;pd-ssd&#34; (Persistent Disk Solid State Drive) or &#34;pd-standard&#34; (Persistent Disk Hard Disk Drive).
     * 
     */
    @Import(name="bootDiskType", required=true)
    private String bootDiskType;

    public String bootDiskType() {
        return this.bootDiskType;
    }

    private GoogleCloudMlV1__DiskConfigResponse() {}

    private GoogleCloudMlV1__DiskConfigResponse(GoogleCloudMlV1__DiskConfigResponse $) {
        this.bootDiskSizeGb = $.bootDiskSizeGb;
        this.bootDiskType = $.bootDiskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudMlV1__DiskConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1__DiskConfigResponse $;

        public Builder() {
            $ = new GoogleCloudMlV1__DiskConfigResponse();
        }

        public Builder(GoogleCloudMlV1__DiskConfigResponse defaults) {
            $ = new GoogleCloudMlV1__DiskConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder bootDiskSizeGb(Integer bootDiskSizeGb) {
            $.bootDiskSizeGb = bootDiskSizeGb;
            return this;
        }

        public Builder bootDiskType(String bootDiskType) {
            $.bootDiskType = bootDiskType;
            return this;
        }

        public GoogleCloudMlV1__DiskConfigResponse build() {
            $.bootDiskSizeGb = Objects.requireNonNull($.bootDiskSizeGb, "expected parameter 'bootDiskSizeGb' to be non-null");
            $.bootDiskType = Objects.requireNonNull($.bootDiskType, "expected parameter 'bootDiskType' to be non-null");
            return $;
        }
    }

}
