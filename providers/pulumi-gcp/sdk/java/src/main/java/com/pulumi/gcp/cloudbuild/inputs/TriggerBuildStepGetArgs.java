// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudbuild.inputs.TriggerBuildStepVolumeGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerBuildStepGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerBuildStepGetArgs Empty = new TriggerBuildStepGetArgs();

    /**
     * A list of arguments that will be presented to the step when it is started.
     * If the image used to run the step&#39;s container has an entrypoint, the args
     * are used as arguments to that entrypoint. If the image does not define an
     * entrypoint, the first element in args is used as the entrypoint, and the
     * remainder will be used as arguments.
     * 
     */
    @Import(name="args")
    private @Nullable Output<List<String>> args;

    public Optional<Output<List<String>>> args() {
        return Optional.ofNullable(this.args);
    }

    /**
     * Working directory to use when running this step&#39;s container.
     * If this value is a relative path, it is relative to the build&#39;s working
     * directory. If this value is absolute, it may be outside the build&#39;s working
     * directory, in which case the contents of the path may not be persisted
     * across build step executions, unless a `volume` for that path is specified.
     * If the build specifies a `RepoSource` with `dir` and a step with a
     * `dir`,
     * which specifies an absolute path, the `RepoSource` `dir` is ignored
     * for the step&#39;s execution.
     * 
     */
    @Import(name="dir")
    private @Nullable Output<String> dir;

    public Optional<Output<String>> dir() {
        return Optional.ofNullable(this.dir);
    }

    /**
     * Entrypoint to be used instead of the build step image&#39;s
     * default entrypoint.
     * If unset, the image&#39;s default entrypoint is used
     * 
     */
    @Import(name="entrypoint")
    private @Nullable Output<String> entrypoint;

    public Optional<Output<String>> entrypoint() {
        return Optional.ofNullable(this.entrypoint);
    }

    /**
     * A list of global environment variable definitions that will exist for all build steps
     * in this build. If a variable is defined in both globally and in a build step,
     * the variable will use the build step value.
     * The elements are of the form &#34;KEY=VALUE&#34; for the environment variable &#34;KEY&#34; being given the value &#34;VALUE&#34;.
     * 
     */
    @Import(name="envs")
    private @Nullable Output<List<String>> envs;

    public Optional<Output<List<String>>> envs() {
        return Optional.ofNullable(this.envs);
    }

    /**
     * Unique identifier for this build step, used in `wait_for` to
     * reference this build step as a dependency.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for Docker volumes.
     * Each named volume must be used by at least two build steps.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * A list of global environment variables, which are encrypted using a Cloud Key Management
     * Service crypto key. These values must be specified in the build&#39;s Secret. These variables
     * will be available to all build steps in this build.
     * 
     */
    @Import(name="secretEnvs")
    private @Nullable Output<List<String>> secretEnvs;

    public Optional<Output<List<String>>> secretEnvs() {
        return Optional.ofNullable(this.secretEnvs);
    }

    /**
     * Time limit for executing this build step. If not defined,
     * the step has no
     * time limit and will be allowed to continue to run until either it
     * completes or the build itself times out.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<String> timeout;

    public Optional<Output<String>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * - 
     * Output only. Stores timing information for pushing all artifact objects.
     * Structure is documented below.
     * 
     */
    @Import(name="timing")
    private @Nullable Output<String> timing;

    public Optional<Output<String>> timing() {
        return Optional.ofNullable(this.timing);
    }

    /**
     * Global list of volumes to mount for ALL build steps
     * Each volume is created as an empty volume prior to starting the build process.
     * Upon completion of the build, volumes and their contents are discarded. Global
     * volume names and paths cannot conflict with the volumes defined a build step.
     * Using a global volume in a build with only one step is not valid as it is indicative
     * of a build request with an incorrect configuration.
     * Structure is documented below.
     * 
     */
    @Import(name="volumes")
    private @Nullable Output<List<TriggerBuildStepVolumeGetArgs>> volumes;

    public Optional<Output<List<TriggerBuildStepVolumeGetArgs>>> volumes() {
        return Optional.ofNullable(this.volumes);
    }

    /**
     * The ID(s) of the step(s) that this build step depends on.
     * This build step will not start until all the build steps in `wait_for`
     * have completed successfully. If `wait_for` is empty, this build step
     * will start when all previous build steps in the `Build.Steps` list
     * have completed successfully.
     * 
     */
    @Import(name="waitFors")
    private @Nullable Output<List<String>> waitFors;

    public Optional<Output<List<String>>> waitFors() {
        return Optional.ofNullable(this.waitFors);
    }

    private TriggerBuildStepGetArgs() {}

    private TriggerBuildStepGetArgs(TriggerBuildStepGetArgs $) {
        this.args = $.args;
        this.dir = $.dir;
        this.entrypoint = $.entrypoint;
        this.envs = $.envs;
        this.id = $.id;
        this.name = $.name;
        this.secretEnvs = $.secretEnvs;
        this.timeout = $.timeout;
        this.timing = $.timing;
        this.volumes = $.volumes;
        this.waitFors = $.waitFors;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerBuildStepGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerBuildStepGetArgs $;

        public Builder() {
            $ = new TriggerBuildStepGetArgs();
        }

        public Builder(TriggerBuildStepGetArgs defaults) {
            $ = new TriggerBuildStepGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder args(@Nullable Output<List<String>> args) {
            $.args = args;
            return this;
        }

        public Builder args(List<String> args) {
            return args(Output.of(args));
        }

        public Builder args(String... args) {
            return args(List.of(args));
        }

        public Builder dir(@Nullable Output<String> dir) {
            $.dir = dir;
            return this;
        }

        public Builder dir(String dir) {
            return dir(Output.of(dir));
        }

        public Builder entrypoint(@Nullable Output<String> entrypoint) {
            $.entrypoint = entrypoint;
            return this;
        }

        public Builder entrypoint(String entrypoint) {
            return entrypoint(Output.of(entrypoint));
        }

        public Builder envs(@Nullable Output<List<String>> envs) {
            $.envs = envs;
            return this;
        }

        public Builder envs(List<String> envs) {
            return envs(Output.of(envs));
        }

        public Builder envs(String... envs) {
            return envs(List.of(envs));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder secretEnvs(@Nullable Output<List<String>> secretEnvs) {
            $.secretEnvs = secretEnvs;
            return this;
        }

        public Builder secretEnvs(List<String> secretEnvs) {
            return secretEnvs(Output.of(secretEnvs));
        }

        public Builder secretEnvs(String... secretEnvs) {
            return secretEnvs(List.of(secretEnvs));
        }

        public Builder timeout(@Nullable Output<String> timeout) {
            $.timeout = timeout;
            return this;
        }

        public Builder timeout(String timeout) {
            return timeout(Output.of(timeout));
        }

        public Builder timing(@Nullable Output<String> timing) {
            $.timing = timing;
            return this;
        }

        public Builder timing(String timing) {
            return timing(Output.of(timing));
        }

        public Builder volumes(@Nullable Output<List<TriggerBuildStepVolumeGetArgs>> volumes) {
            $.volumes = volumes;
            return this;
        }

        public Builder volumes(List<TriggerBuildStepVolumeGetArgs> volumes) {
            return volumes(Output.of(volumes));
        }

        public Builder volumes(TriggerBuildStepVolumeGetArgs... volumes) {
            return volumes(List.of(volumes));
        }

        public Builder waitFors(@Nullable Output<List<String>> waitFors) {
            $.waitFors = waitFors;
            return this;
        }

        public Builder waitFors(List<String> waitFors) {
            return waitFors(Output.of(waitFors));
        }

        public Builder waitFors(String... waitFors) {
            return waitFors(List.of(waitFors));
        }

        public TriggerBuildStepGetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
