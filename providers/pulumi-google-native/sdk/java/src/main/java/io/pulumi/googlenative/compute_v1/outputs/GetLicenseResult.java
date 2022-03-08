// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_v1.outputs.LicenseResourceRequirementsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetLicenseResult {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    private final String description;
    /**
     * Type of resource. Always compute#license for licenses.
     * 
     */
    private final String kind;
    /**
     * The unique code used to attach this license to images, snapshots, and disks.
     * 
     */
    private final String licenseCode;
    /**
     * Name of the resource. The name must be 1-63 characters long and comply with RFC1035.
     * 
     */
    private final String name;
    private final LicenseResourceRequirementsResponse resourceRequirements;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * If false, licenses will not be copied from the source resource when creating an image from a disk, disk from snapshot, or snapshot from disk.
     * 
     */
    private final Boolean transferable;

    @OutputCustomType.Constructor({"creationTimestamp","description","kind","licenseCode","name","resourceRequirements","selfLink","transferable"})
    private GetLicenseResult(
        String creationTimestamp,
        String description,
        String kind,
        String licenseCode,
        String name,
        LicenseResourceRequirementsResponse resourceRequirements,
        String selfLink,
        Boolean transferable) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.kind = kind;
        this.licenseCode = licenseCode;
        this.name = name;
        this.resourceRequirements = resourceRequirements;
        this.selfLink = selfLink;
        this.transferable = transferable;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional textual description of the resource; provided by the client when the resource is created.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Type of resource. Always compute#license for licenses.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * The unique code used to attach this license to images, snapshots, and disks.
     * 
    */
    public String getLicenseCode() {
        return this.licenseCode;
    }
    /**
     * Name of the resource. The name must be 1-63 characters long and comply with RFC1035.
     * 
    */
    public String getName() {
        return this.name;
    }
    public LicenseResourceRequirementsResponse getResourceRequirements() {
        return this.resourceRequirements;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * If false, licenses will not be copied from the source resource when creating an image from a disk, disk from snapshot, or snapshot from disk.
     * 
    */
    public Boolean getTransferable() {
        return this.transferable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicenseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private String description;
        private String kind;
        private String licenseCode;
        private String name;
        private LicenseResourceRequirementsResponse resourceRequirements;
        private String selfLink;
        private Boolean transferable;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLicenseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.licenseCode = defaults.licenseCode;
    	      this.name = defaults.name;
    	      this.resourceRequirements = defaults.resourceRequirements;
    	      this.selfLink = defaults.selfLink;
    	      this.transferable = defaults.transferable;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLicenseCode(String licenseCode) {
            this.licenseCode = Objects.requireNonNull(licenseCode);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceRequirements(LicenseResourceRequirementsResponse resourceRequirements) {
            this.resourceRequirements = Objects.requireNonNull(resourceRequirements);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setTransferable(Boolean transferable) {
            this.transferable = Objects.requireNonNull(transferable);
            return this;
        }
        public GetLicenseResult build() {
            return new GetLicenseResult(creationTimestamp, description, kind, licenseCode, name, resourceRequirements, selfLink, transferable);
        }
    }
}
