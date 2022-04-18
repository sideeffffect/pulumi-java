// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupAppEngineArgs;
import com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupCloudFunctionArgs;
import com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupCloudRunArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionNetworkEndpointGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionNetworkEndpointGroupArgs Empty = new RegionNetworkEndpointGroupArgs();

    /**
     * Only valid when networkEndpointType is "SERVERLESS".
     * Only one of cloud_run, app_engine or cloud_function may be set.
     * Structure is documented below.
     * 
     */
    @Import(name="appEngine")
      private final @Nullable Output<RegionNetworkEndpointGroupAppEngineArgs> appEngine;

    public Output<RegionNetworkEndpointGroupAppEngineArgs> appEngine() {
        return this.appEngine == null ? Codegen.empty() : this.appEngine;
    }

    /**
     * Only valid when networkEndpointType is "SERVERLESS".
     * Only one of cloud_run, app_engine or cloud_function may be set.
     * Structure is documented below.
     * 
     */
    @Import(name="cloudFunction")
      private final @Nullable Output<RegionNetworkEndpointGroupCloudFunctionArgs> cloudFunction;

    public Output<RegionNetworkEndpointGroupCloudFunctionArgs> cloudFunction() {
        return this.cloudFunction == null ? Codegen.empty() : this.cloudFunction;
    }

    /**
     * Only valid when networkEndpointType is "SERVERLESS".
     * Only one of cloud_run, app_engine or cloud_function may be set.
     * Structure is documented below.
     * 
     */
    @Import(name="cloudRun")
      private final @Nullable Output<RegionNetworkEndpointGroupCloudRunArgs> cloudRun;

    public Output<RegionNetworkEndpointGroupCloudRunArgs> cloudRun() {
        return this.cloudRun == null ? Codegen.empty() : this.cloudRun;
    }

    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Name of the resource; provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Type of network endpoints in this network endpoint group. Defaults to SERVERLESS
     * Default value is `SERVERLESS`.
     * Possible values are `SERVERLESS`.
     * 
     */
    @Import(name="networkEndpointType")
      private final @Nullable Output<String> networkEndpointType;

    public Output<String> networkEndpointType() {
        return this.networkEndpointType == null ? Codegen.empty() : this.networkEndpointType;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * A reference to the region where the Serverless NEGs Reside.
     * 
     */
    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    public RegionNetworkEndpointGroupArgs(
        @Nullable Output<RegionNetworkEndpointGroupAppEngineArgs> appEngine,
        @Nullable Output<RegionNetworkEndpointGroupCloudFunctionArgs> cloudFunction,
        @Nullable Output<RegionNetworkEndpointGroupCloudRunArgs> cloudRun,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> networkEndpointType,
        @Nullable Output<String> project,
        Output<String> region) {
        this.appEngine = appEngine;
        this.cloudFunction = cloudFunction;
        this.cloudRun = cloudRun;
        this.description = description;
        this.name = name;
        this.networkEndpointType = networkEndpointType;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private RegionNetworkEndpointGroupArgs() {
        this.appEngine = Codegen.empty();
        this.cloudFunction = Codegen.empty();
        this.cloudRun = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.networkEndpointType = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionNetworkEndpointGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RegionNetworkEndpointGroupAppEngineArgs> appEngine;
        private @Nullable Output<RegionNetworkEndpointGroupCloudFunctionArgs> cloudFunction;
        private @Nullable Output<RegionNetworkEndpointGroupCloudRunArgs> cloudRun;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> networkEndpointType;
        private @Nullable Output<String> project;
        private Output<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionNetworkEndpointGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngine = defaults.appEngine;
    	      this.cloudFunction = defaults.cloudFunction;
    	      this.cloudRun = defaults.cloudRun;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.networkEndpointType = defaults.networkEndpointType;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder appEngine(@Nullable Output<RegionNetworkEndpointGroupAppEngineArgs> appEngine) {
            this.appEngine = appEngine;
            return this;
        }
        public Builder appEngine(@Nullable RegionNetworkEndpointGroupAppEngineArgs appEngine) {
            this.appEngine = Codegen.ofNullable(appEngine);
            return this;
        }
        public Builder cloudFunction(@Nullable Output<RegionNetworkEndpointGroupCloudFunctionArgs> cloudFunction) {
            this.cloudFunction = cloudFunction;
            return this;
        }
        public Builder cloudFunction(@Nullable RegionNetworkEndpointGroupCloudFunctionArgs cloudFunction) {
            this.cloudFunction = Codegen.ofNullable(cloudFunction);
            return this;
        }
        public Builder cloudRun(@Nullable Output<RegionNetworkEndpointGroupCloudRunArgs> cloudRun) {
            this.cloudRun = cloudRun;
            return this;
        }
        public Builder cloudRun(@Nullable RegionNetworkEndpointGroupCloudRunArgs cloudRun) {
            this.cloudRun = Codegen.ofNullable(cloudRun);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder networkEndpointType(@Nullable Output<String> networkEndpointType) {
            this.networkEndpointType = networkEndpointType;
            return this;
        }
        public Builder networkEndpointType(@Nullable String networkEndpointType) {
            this.networkEndpointType = Codegen.ofNullable(networkEndpointType);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }        public RegionNetworkEndpointGroupArgs build() {
            return new RegionNetworkEndpointGroupArgs(appEngine, cloudFunction, cloudRun, description, name, networkEndpointType, project, region);
        }
    }
}
