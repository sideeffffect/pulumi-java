// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the data disk used by a workflow job.
 * 
 */
public final class DiskResponse extends com.pulumi.resources.InvokeArgs {

    public static final DiskResponse Empty = new DiskResponse();

    /**
     * Disk storage type, as defined by Google Compute Engine. This must be a disk type appropriate to the project and zone in which the workers will run. If unknown or unspecified, the service will attempt to choose a reasonable default. For example, the standard persistent disk type is a resource name typically ending in &#34;pd-standard&#34;. If SSD persistent disks are available, the resource name typically ends with &#34;pd-ssd&#34;. The actual valid values are defined the Google Compute Engine API, not by the Cloud Dataflow API; consult the Google Compute Engine documentation for more information about determining the set of available disk types for a particular project and zone. Google Compute Engine Disk types are local to a particular project in a particular zone, and so the resource name will typically look something like this: compute.googleapis.com/projects/project-id/zones/zone/diskTypes/pd-standard
     * 
     */
    @Import(name="diskType", required=true)
    private String diskType;

    public String diskType() {
        return this.diskType;
    }

    /**
     * Directory in a VM where disk is mounted.
     * 
     */
    @Import(name="mountPoint", required=true)
    private String mountPoint;

    public String mountPoint() {
        return this.mountPoint;
    }

    /**
     * Size of disk in GB. If zero or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @Import(name="sizeGb", required=true)
    private Integer sizeGb;

    public Integer sizeGb() {
        return this.sizeGb;
    }

    private DiskResponse() {}

    private DiskResponse(DiskResponse $) {
        this.diskType = $.diskType;
        this.mountPoint = $.mountPoint;
        this.sizeGb = $.sizeGb;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskResponse $;

        public Builder() {
            $ = new DiskResponse();
        }

        public Builder(DiskResponse defaults) {
            $ = new DiskResponse(Objects.requireNonNull(defaults));
        }

        public Builder diskType(String diskType) {
            $.diskType = diskType;
            return this;
        }

        public Builder mountPoint(String mountPoint) {
            $.mountPoint = mountPoint;
            return this;
        }

        public Builder sizeGb(Integer sizeGb) {
            $.sizeGb = sizeGb;
            return this;
        }

        public DiskResponse build() {
            $.diskType = Objects.requireNonNull($.diskType, "expected parameter 'diskType' to be non-null");
            $.mountPoint = Objects.requireNonNull($.mountPoint, "expected parameter 'mountPoint' to be non-null");
            $.sizeGb = Objects.requireNonNull($.sizeGb, "expected parameter 'sizeGb' to be non-null");
            return $;
        }
    }

}
