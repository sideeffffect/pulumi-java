// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.genomics.v1alpha2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DiskResponse {
    /**
     * @return Deprecated. Disks created by the Pipelines API will be deleted at the end of the pipeline run, regardless of what this field is set to.
     * 
     * @deprecated
     * Deprecated. Disks created by the Pipelines API will be deleted at the end of the pipeline run, regardless of what this field is set to.
     * 
     */
    @Deprecated /* Deprecated. Disks created by the Pipelines API will be deleted at the end of the pipeline run, regardless of what this field is set to. */
    private final Boolean autoDelete;
    /**
     * @return Required at create time and cannot be overridden at run time. Specifies the path in the docker container where files on this disk should be located. For example, if `mountPoint` is `/mnt/disk`, and the parameter has `localPath` `inputs/file.txt`, the docker container can access the data at `/mnt/disk/inputs/file.txt`.
     * 
     */
    private final String mountPoint;
    /**
     * @return The name of the disk that can be used in the pipeline parameters. Must be 1 - 63 characters. The name &#34;boot&#34; is reserved for system use.
     * 
     */
    private final String name;
    /**
     * @return Specifies how a sourced-base persistent disk will be mounted. See https://cloud.google.com/compute/docs/disks/persistent-disks#use_multi_instances for more details. Can only be set at create time.
     * 
     */
    private final Boolean readOnly;
    /**
     * @return The size of the disk. Defaults to 500 (GB). This field is not applicable for local SSD.
     * 
     */
    private final Integer sizeGb;
    /**
     * @return The full or partial URL of the persistent disk to attach. See https://cloud.google.com/compute/docs/reference/latest/instances#resource and https://cloud.google.com/compute/docs/disks/persistent-disks#snapshots for more details.
     * 
     */
    private final String source;
    /**
     * @return The type of the disk to create.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private DiskResponse(
        @CustomType.Parameter("autoDelete") Boolean autoDelete,
        @CustomType.Parameter("mountPoint") String mountPoint,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("readOnly") Boolean readOnly,
        @CustomType.Parameter("sizeGb") Integer sizeGb,
        @CustomType.Parameter("source") String source,
        @CustomType.Parameter("type") String type) {
        this.autoDelete = autoDelete;
        this.mountPoint = mountPoint;
        this.name = name;
        this.readOnly = readOnly;
        this.sizeGb = sizeGb;
        this.source = source;
        this.type = type;
    }

    /**
     * @return Deprecated. Disks created by the Pipelines API will be deleted at the end of the pipeline run, regardless of what this field is set to.
     * 
     * @deprecated
     * Deprecated. Disks created by the Pipelines API will be deleted at the end of the pipeline run, regardless of what this field is set to.
     * 
     */
    @Deprecated /* Deprecated. Disks created by the Pipelines API will be deleted at the end of the pipeline run, regardless of what this field is set to. */
    public Boolean autoDelete() {
        return this.autoDelete;
    }
    /**
     * @return Required at create time and cannot be overridden at run time. Specifies the path in the docker container where files on this disk should be located. For example, if `mountPoint` is `/mnt/disk`, and the parameter has `localPath` `inputs/file.txt`, the docker container can access the data at `/mnt/disk/inputs/file.txt`.
     * 
     */
    public String mountPoint() {
        return this.mountPoint;
    }
    /**
     * @return The name of the disk that can be used in the pipeline parameters. Must be 1 - 63 characters. The name &#34;boot&#34; is reserved for system use.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specifies how a sourced-base persistent disk will be mounted. See https://cloud.google.com/compute/docs/disks/persistent-disks#use_multi_instances for more details. Can only be set at create time.
     * 
     */
    public Boolean readOnly() {
        return this.readOnly;
    }
    /**
     * @return The size of the disk. Defaults to 500 (GB). This field is not applicable for local SSD.
     * 
     */
    public Integer sizeGb() {
        return this.sizeGb;
    }
    /**
     * @return The full or partial URL of the persistent disk to attach. See https://cloud.google.com/compute/docs/reference/latest/instances#resource and https://cloud.google.com/compute/docs/disks/persistent-disks#snapshots for more details.
     * 
     */
    public String source() {
        return this.source;
    }
    /**
     * @return The type of the disk to create.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoDelete;
        private String mountPoint;
        private String name;
        private Boolean readOnly;
        private Integer sizeGb;
        private String source;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.mountPoint = defaults.mountPoint;
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
    	      this.sizeGb = defaults.sizeGb;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
        }

        public Builder autoDelete(Boolean autoDelete) {
            this.autoDelete = Objects.requireNonNull(autoDelete);
            return this;
        }
        public Builder mountPoint(String mountPoint) {
            this.mountPoint = Objects.requireNonNull(mountPoint);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder readOnly(Boolean readOnly) {
            this.readOnly = Objects.requireNonNull(readOnly);
            return this;
        }
        public Builder sizeGb(Integer sizeGb) {
            this.sizeGb = Objects.requireNonNull(sizeGb);
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public DiskResponse build() {
            return new DiskResponse(autoDelete, mountPoint, name, readOnly, sizeGb, source, type);
        }
    }
}
