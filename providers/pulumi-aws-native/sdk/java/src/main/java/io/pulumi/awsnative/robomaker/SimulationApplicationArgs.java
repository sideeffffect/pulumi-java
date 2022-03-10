// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker;

import io.pulumi.awsnative.robomaker.inputs.SimulationApplicationRenderingEngineArgs;
import io.pulumi.awsnative.robomaker.inputs.SimulationApplicationRobotSoftwareSuiteArgs;
import io.pulumi.awsnative.robomaker.inputs.SimulationApplicationSimulationSoftwareSuiteArgs;
import io.pulumi.awsnative.robomaker.inputs.SimulationApplicationSourceConfigArgs;
import io.pulumi.awsnative.robomaker.inputs.SimulationApplicationTagsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SimulationApplicationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SimulationApplicationArgs Empty = new SimulationApplicationArgs();

    /**
     * The current revision id.
     * 
     */
    @InputImport(name="currentRevisionId")
      private final @Nullable Input<String> currentRevisionId;

    public Input<String> getCurrentRevisionId() {
        return this.currentRevisionId == null ? Input.empty() : this.currentRevisionId;
    }

    /**
     * The URI of the Docker image for the robot application.
     * 
     */
    @InputImport(name="environment")
      private final @Nullable Input<String> environment;

    public Input<String> getEnvironment() {
        return this.environment == null ? Input.empty() : this.environment;
    }

    /**
     * The name of the simulation application.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The rendering engine for the simulation application.
     * 
     */
    @InputImport(name="renderingEngine")
      private final @Nullable Input<SimulationApplicationRenderingEngineArgs> renderingEngine;

    public Input<SimulationApplicationRenderingEngineArgs> getRenderingEngine() {
        return this.renderingEngine == null ? Input.empty() : this.renderingEngine;
    }

    /**
     * The robot software suite used by the simulation application.
     * 
     */
    @InputImport(name="robotSoftwareSuite", required=true)
      private final Input<SimulationApplicationRobotSoftwareSuiteArgs> robotSoftwareSuite;

    public Input<SimulationApplicationRobotSoftwareSuiteArgs> getRobotSoftwareSuite() {
        return this.robotSoftwareSuite;
    }

    /**
     * The simulation software suite used by the simulation application.
     * 
     */
    @InputImport(name="simulationSoftwareSuite", required=true)
      private final Input<SimulationApplicationSimulationSoftwareSuiteArgs> simulationSoftwareSuite;

    public Input<SimulationApplicationSimulationSoftwareSuiteArgs> getSimulationSoftwareSuite() {
        return this.simulationSoftwareSuite;
    }

    /**
     * The sources of the simulation application.
     * 
     */
    @InputImport(name="sources")
      private final @Nullable Input<List<SimulationApplicationSourceConfigArgs>> sources;

    public Input<List<SimulationApplicationSourceConfigArgs>> getSources() {
        return this.sources == null ? Input.empty() : this.sources;
    }

    @InputImport(name="tags")
      private final @Nullable Input<SimulationApplicationTagsArgs> tags;

    public Input<SimulationApplicationTagsArgs> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public SimulationApplicationArgs(
        @Nullable Input<String> currentRevisionId,
        @Nullable Input<String> environment,
        @Nullable Input<String> name,
        @Nullable Input<SimulationApplicationRenderingEngineArgs> renderingEngine,
        Input<SimulationApplicationRobotSoftwareSuiteArgs> robotSoftwareSuite,
        Input<SimulationApplicationSimulationSoftwareSuiteArgs> simulationSoftwareSuite,
        @Nullable Input<List<SimulationApplicationSourceConfigArgs>> sources,
        @Nullable Input<SimulationApplicationTagsArgs> tags) {
        this.currentRevisionId = currentRevisionId;
        this.environment = environment;
        this.name = name;
        this.renderingEngine = renderingEngine;
        this.robotSoftwareSuite = Objects.requireNonNull(robotSoftwareSuite, "expected parameter 'robotSoftwareSuite' to be non-null");
        this.simulationSoftwareSuite = Objects.requireNonNull(simulationSoftwareSuite, "expected parameter 'simulationSoftwareSuite' to be non-null");
        this.sources = sources;
        this.tags = tags;
    }

    private SimulationApplicationArgs() {
        this.currentRevisionId = Input.empty();
        this.environment = Input.empty();
        this.name = Input.empty();
        this.renderingEngine = Input.empty();
        this.robotSoftwareSuite = Input.empty();
        this.simulationSoftwareSuite = Input.empty();
        this.sources = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SimulationApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> currentRevisionId;
        private @Nullable Input<String> environment;
        private @Nullable Input<String> name;
        private @Nullable Input<SimulationApplicationRenderingEngineArgs> renderingEngine;
        private Input<SimulationApplicationRobotSoftwareSuiteArgs> robotSoftwareSuite;
        private Input<SimulationApplicationSimulationSoftwareSuiteArgs> simulationSoftwareSuite;
        private @Nullable Input<List<SimulationApplicationSourceConfigArgs>> sources;
        private @Nullable Input<SimulationApplicationTagsArgs> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SimulationApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentRevisionId = defaults.currentRevisionId;
    	      this.environment = defaults.environment;
    	      this.name = defaults.name;
    	      this.renderingEngine = defaults.renderingEngine;
    	      this.robotSoftwareSuite = defaults.robotSoftwareSuite;
    	      this.simulationSoftwareSuite = defaults.simulationSoftwareSuite;
    	      this.sources = defaults.sources;
    	      this.tags = defaults.tags;
        }

        public Builder currentRevisionId(@Nullable Input<String> currentRevisionId) {
            this.currentRevisionId = currentRevisionId;
            return this;
        }

        public Builder currentRevisionId(@Nullable String currentRevisionId) {
            this.currentRevisionId = Input.ofNullable(currentRevisionId);
            return this;
        }

        public Builder environment(@Nullable Input<String> environment) {
            this.environment = environment;
            return this;
        }

        public Builder environment(@Nullable String environment) {
            this.environment = Input.ofNullable(environment);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder renderingEngine(@Nullable Input<SimulationApplicationRenderingEngineArgs> renderingEngine) {
            this.renderingEngine = renderingEngine;
            return this;
        }

        public Builder renderingEngine(@Nullable SimulationApplicationRenderingEngineArgs renderingEngine) {
            this.renderingEngine = Input.ofNullable(renderingEngine);
            return this;
        }

        public Builder robotSoftwareSuite(Input<SimulationApplicationRobotSoftwareSuiteArgs> robotSoftwareSuite) {
            this.robotSoftwareSuite = Objects.requireNonNull(robotSoftwareSuite);
            return this;
        }

        public Builder robotSoftwareSuite(SimulationApplicationRobotSoftwareSuiteArgs robotSoftwareSuite) {
            this.robotSoftwareSuite = Input.of(Objects.requireNonNull(robotSoftwareSuite));
            return this;
        }

        public Builder simulationSoftwareSuite(Input<SimulationApplicationSimulationSoftwareSuiteArgs> simulationSoftwareSuite) {
            this.simulationSoftwareSuite = Objects.requireNonNull(simulationSoftwareSuite);
            return this;
        }

        public Builder simulationSoftwareSuite(SimulationApplicationSimulationSoftwareSuiteArgs simulationSoftwareSuite) {
            this.simulationSoftwareSuite = Input.of(Objects.requireNonNull(simulationSoftwareSuite));
            return this;
        }

        public Builder sources(@Nullable Input<List<SimulationApplicationSourceConfigArgs>> sources) {
            this.sources = sources;
            return this;
        }

        public Builder sources(@Nullable List<SimulationApplicationSourceConfigArgs> sources) {
            this.sources = Input.ofNullable(sources);
            return this;
        }

        public Builder tags(@Nullable Input<SimulationApplicationTagsArgs> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable SimulationApplicationTagsArgs tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public SimulationApplicationArgs build() {
            return new SimulationApplicationArgs(currentRevisionId, environment, name, renderingEngine, robotSoftwareSuite, simulationSoftwareSuite, sources, tags);
        }
    }
}
