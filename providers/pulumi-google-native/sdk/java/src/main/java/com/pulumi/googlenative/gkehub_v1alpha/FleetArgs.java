// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FleetArgs Empty = new FleetArgs();

    /**
     * Optional. A user-assigned display name of the Fleet. When present, it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, single-quote, double-quote, space, and exclamation point. Example: `Production Fleet`
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The name for the fleet. The name must meet the following constraints: + The name of a fleet should be unique within the organization; + It must consist of lower case alphanumeric characters or `-`; + The length of the name must be less than or equal to 63; + Unicode names must be expressed in Punycode format (rfc3492). Examples: + prod-fleet + xn--wlq33vhyw9jb （Punycode form for "生产环境")
     * 
     */
    @Import(name="fleetName")
      private final @Nullable Output<String> fleetName;

    public Output<String> fleetName() {
        return this.fleetName == null ? Codegen.empty() : this.fleetName;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public FleetArgs(
        @Nullable Output<String> displayName,
        @Nullable Output<String> fleetName,
        @Nullable Output<String> location,
        @Nullable Output<String> project) {
        this.displayName = displayName;
        this.fleetName = fleetName;
        this.location = location;
        this.project = project;
    }

    private FleetArgs() {
        this.displayName = Codegen.empty();
        this.fleetName = Codegen.empty();
        this.location = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> fleetName;
        private @Nullable Output<String> location;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.fleetName = defaults.fleetName;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder fleetName(@Nullable Output<String> fleetName) {
            this.fleetName = fleetName;
            return this;
        }
        public Builder fleetName(@Nullable String fleetName) {
            this.fleetName = Codegen.ofNullable(fleetName);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public FleetArgs build() {
            return new FleetArgs(displayName, fleetName, location, project);
        }
    }
}
