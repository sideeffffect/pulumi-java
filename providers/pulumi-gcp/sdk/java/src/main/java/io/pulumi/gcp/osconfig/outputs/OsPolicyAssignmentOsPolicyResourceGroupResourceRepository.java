// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryApt;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGoo;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryYum;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypper;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OsPolicyAssignmentOsPolicyResourceGroupResourceRepository {
    /**
     * An Apt Repository.
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryApt apt;
    /**
     * A Goo Repository.
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGoo goo;
    /**
     * A Yum Repository.
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryYum yum;
    /**
     * A Zypper Repository.
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypper zypper;

    @CustomType.Constructor
    private OsPolicyAssignmentOsPolicyResourceGroupResourceRepository(
        @CustomType.Parameter("apt") @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryApt apt,
        @CustomType.Parameter("goo") @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGoo goo,
        @CustomType.Parameter("yum") @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryYum yum,
        @CustomType.Parameter("zypper") @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypper zypper) {
        this.apt = apt;
        this.goo = goo;
        this.yum = yum;
        this.zypper = zypper;
    }

    /**
     * An Apt Repository.
     * 
    */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryApt> apt() {
        return Optional.ofNullable(this.apt);
    }
    /**
     * A Goo Repository.
     * 
    */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGoo> goo() {
        return Optional.ofNullable(this.goo);
    }
    /**
     * A Yum Repository.
     * 
    */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryYum> yum() {
        return Optional.ofNullable(this.yum);
    }
    /**
     * A Zypper Repository.
     * 
    */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypper> zypper() {
        return Optional.ofNullable(this.zypper);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceRepository defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryApt apt;
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGoo goo;
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryYum yum;
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypper zypper;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceRepository defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apt = defaults.apt;
    	      this.goo = defaults.goo;
    	      this.yum = defaults.yum;
    	      this.zypper = defaults.zypper;
        }

        public Builder apt(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryApt apt) {
            this.apt = apt;
            return this;
        }
        public Builder goo(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGoo goo) {
            this.goo = goo;
            return this;
        }
        public Builder yum(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryYum yum) {
            this.yum = yum;
            return this;
        }
        public Builder zypper(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypper zypper) {
            this.zypper = zypper;
            return this;
        }        public OsPolicyAssignmentOsPolicyResourceGroupResourceRepository build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceRepository(apt, goo, yum, zypper);
        }
    }
}
