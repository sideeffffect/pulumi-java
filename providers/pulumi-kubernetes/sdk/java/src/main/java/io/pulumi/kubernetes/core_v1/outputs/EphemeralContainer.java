// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.ContainerPort;
import io.pulumi.kubernetes.core_v1.outputs.EnvFromSource;
import io.pulumi.kubernetes.core_v1.outputs.EnvVar;
import io.pulumi.kubernetes.core_v1.outputs.Lifecycle;
import io.pulumi.kubernetes.core_v1.outputs.Probe;
import io.pulumi.kubernetes.core_v1.outputs.ResourceRequirements;
import io.pulumi.kubernetes.core_v1.outputs.SecurityContext;
import io.pulumi.kubernetes.core_v1.outputs.VolumeDevice;
import io.pulumi.kubernetes.core_v1.outputs.VolumeMount;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EphemeralContainer {
    /**
     * Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    private final @Nullable List<String> args;
    /**
     * Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    private final @Nullable List<String> command;
    /**
     * List of environment variables to set in the container. Cannot be updated.
     * 
     */
    private final @Nullable List<EnvVar> env;
    /**
     * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
     * 
     */
    private final @Nullable List<EnvFromSource> envFrom;
    /**
     * Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    private final @Nullable String image;
    /**
     * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     * 
     * Possible enum values:
     *  - `"Always"` means that kubelet always attempts to pull the latest image. Container will fail If the pull fails.
     *  - `"IfNotPresent"` means that kubelet pulls if the image isn't present on disk. Container will fail if the image isn't present and the pull fails.
     *  - `"Never"` means that kubelet never pulls an image, but only uses a local image. Container will fail if the image isn't present
     * 
     */
    private final @Nullable String imagePullPolicy;
    /**
     * Lifecycle is not allowed for ephemeral containers.
     * 
     */
    private final @Nullable Lifecycle lifecycle;
    /**
     * Probes are not allowed for ephemeral containers.
     * 
     */
    private final @Nullable Probe livenessProbe;
    /**
     * Name of the ephemeral container specified as a DNS_LABEL. This name must be unique among all containers, init containers and ephemeral containers.
     * 
     */
    private final String name;
    /**
     * Ports are not allowed for ephemeral containers.
     * 
     */
    private final @Nullable List<ContainerPort> ports;
    /**
     * Probes are not allowed for ephemeral containers.
     * 
     */
    private final @Nullable Probe readinessProbe;
    /**
     * Resources are not allowed for ephemeral containers. Ephemeral containers use spare resources already allocated to the pod.
     * 
     */
    private final @Nullable ResourceRequirements resources;
    /**
     * Optional: SecurityContext defines the security options the ephemeral container should be run with. If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.
     * 
     */
    private final @Nullable SecurityContext securityContext;
    /**
     * Probes are not allowed for ephemeral containers.
     * 
     */
    private final @Nullable Probe startupProbe;
    /**
     * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
     * 
     */
    private final @Nullable Boolean stdin;
    /**
     * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
     * 
     */
    private final @Nullable Boolean stdinOnce;
    /**
     * If set, the name of the container from PodSpec that this ephemeral container targets. The ephemeral container will be run in the namespaces (IPC, PID, etc) of this container. If not set then the ephemeral container uses the namespaces configured in the Pod spec.
     * 
     * The container runtime must implement support for this feature. If the runtime does not support namespace targeting then the result of setting this field is undefined.
     * 
     */
    private final @Nullable String targetContainerName;
    /**
     * Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
     * 
     */
    private final @Nullable String terminationMessagePath;
    /**
     * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
     * 
     * Possible enum values:
     *  - `"FallbackToLogsOnError"` will read the most recent contents of the container logs for the container status message when the container exits with an error and the terminationMessagePath has no contents.
     *  - `"File"` is the default behavior and will set the container status message to the contents of the container's terminationMessagePath when the container exits.
     * 
     */
    private final @Nullable String terminationMessagePolicy;
    /**
     * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.
     * 
     */
    private final @Nullable Boolean tty;
    /**
     * volumeDevices is the list of block devices to be used by the container.
     * 
     */
    private final @Nullable List<VolumeDevice> volumeDevices;
    /**
     * Pod volumes to mount into the container's filesystem. Subpath mounts are not allowed for ephemeral containers. Cannot be updated.
     * 
     */
    private final @Nullable List<VolumeMount> volumeMounts;
    /**
     * Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
     * 
     */
    private final @Nullable String workingDir;

    @OutputCustomType.Constructor
    private EphemeralContainer(
        @OutputCustomType.Parameter("args") @Nullable List<String> args,
        @OutputCustomType.Parameter("command") @Nullable List<String> command,
        @OutputCustomType.Parameter("env") @Nullable List<EnvVar> env,
        @OutputCustomType.Parameter("envFrom") @Nullable List<EnvFromSource> envFrom,
        @OutputCustomType.Parameter("image") @Nullable String image,
        @OutputCustomType.Parameter("imagePullPolicy") @Nullable String imagePullPolicy,
        @OutputCustomType.Parameter("lifecycle") @Nullable Lifecycle lifecycle,
        @OutputCustomType.Parameter("livenessProbe") @Nullable Probe livenessProbe,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("ports") @Nullable List<ContainerPort> ports,
        @OutputCustomType.Parameter("readinessProbe") @Nullable Probe readinessProbe,
        @OutputCustomType.Parameter("resources") @Nullable ResourceRequirements resources,
        @OutputCustomType.Parameter("securityContext") @Nullable SecurityContext securityContext,
        @OutputCustomType.Parameter("startupProbe") @Nullable Probe startupProbe,
        @OutputCustomType.Parameter("stdin") @Nullable Boolean stdin,
        @OutputCustomType.Parameter("stdinOnce") @Nullable Boolean stdinOnce,
        @OutputCustomType.Parameter("targetContainerName") @Nullable String targetContainerName,
        @OutputCustomType.Parameter("terminationMessagePath") @Nullable String terminationMessagePath,
        @OutputCustomType.Parameter("terminationMessagePolicy") @Nullable String terminationMessagePolicy,
        @OutputCustomType.Parameter("tty") @Nullable Boolean tty,
        @OutputCustomType.Parameter("volumeDevices") @Nullable List<VolumeDevice> volumeDevices,
        @OutputCustomType.Parameter("volumeMounts") @Nullable List<VolumeMount> volumeMounts,
        @OutputCustomType.Parameter("workingDir") @Nullable String workingDir) {
        this.args = args;
        this.command = command;
        this.env = env;
        this.envFrom = envFrom;
        this.image = image;
        this.imagePullPolicy = imagePullPolicy;
        this.lifecycle = lifecycle;
        this.livenessProbe = livenessProbe;
        this.name = name;
        this.ports = ports;
        this.readinessProbe = readinessProbe;
        this.resources = resources;
        this.securityContext = securityContext;
        this.startupProbe = startupProbe;
        this.stdin = stdin;
        this.stdinOnce = stdinOnce;
        this.targetContainerName = targetContainerName;
        this.terminationMessagePath = terminationMessagePath;
        this.terminationMessagePolicy = terminationMessagePolicy;
        this.tty = tty;
        this.volumeDevices = volumeDevices;
        this.volumeMounts = volumeMounts;
        this.workingDir = workingDir;
    }

    /**
     * Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
    */
    public List<String> getArgs() {
        return this.args == null ? List.of() : this.args;
    }
    /**
     * Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
    */
    public List<String> getCommand() {
        return this.command == null ? List.of() : this.command;
    }
    /**
     * List of environment variables to set in the container. Cannot be updated.
     * 
    */
    public List<EnvVar> getEnv() {
        return this.env == null ? List.of() : this.env;
    }
    /**
     * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
     * 
    */
    public List<EnvFromSource> getEnvFrom() {
        return this.envFrom == null ? List.of() : this.envFrom;
    }
    /**
     * Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images
     * 
    */
    public Optional<String> getImage() {
        return Optional.ofNullable(this.image);
    }
    /**
     * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     * 
     * Possible enum values:
     *  - `"Always"` means that kubelet always attempts to pull the latest image. Container will fail If the pull fails.
     *  - `"IfNotPresent"` means that kubelet pulls if the image isn't present on disk. Container will fail if the image isn't present and the pull fails.
     *  - `"Never"` means that kubelet never pulls an image, but only uses a local image. Container will fail if the image isn't present
     * 
    */
    public Optional<String> getImagePullPolicy() {
        return Optional.ofNullable(this.imagePullPolicy);
    }
    /**
     * Lifecycle is not allowed for ephemeral containers.
     * 
    */
    public Optional<Lifecycle> getLifecycle() {
        return Optional.ofNullable(this.lifecycle);
    }
    /**
     * Probes are not allowed for ephemeral containers.
     * 
    */
    public Optional<Probe> getLivenessProbe() {
        return Optional.ofNullable(this.livenessProbe);
    }
    /**
     * Name of the ephemeral container specified as a DNS_LABEL. This name must be unique among all containers, init containers and ephemeral containers.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Ports are not allowed for ephemeral containers.
     * 
    */
    public List<ContainerPort> getPorts() {
        return this.ports == null ? List.of() : this.ports;
    }
    /**
     * Probes are not allowed for ephemeral containers.
     * 
    */
    public Optional<Probe> getReadinessProbe() {
        return Optional.ofNullable(this.readinessProbe);
    }
    /**
     * Resources are not allowed for ephemeral containers. Ephemeral containers use spare resources already allocated to the pod.
     * 
    */
    public Optional<ResourceRequirements> getResources() {
        return Optional.ofNullable(this.resources);
    }
    /**
     * Optional: SecurityContext defines the security options the ephemeral container should be run with. If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.
     * 
    */
    public Optional<SecurityContext> getSecurityContext() {
        return Optional.ofNullable(this.securityContext);
    }
    /**
     * Probes are not allowed for ephemeral containers.
     * 
    */
    public Optional<Probe> getStartupProbe() {
        return Optional.ofNullable(this.startupProbe);
    }
    /**
     * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
     * 
    */
    public Optional<Boolean> getStdin() {
        return Optional.ofNullable(this.stdin);
    }
    /**
     * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
     * 
    */
    public Optional<Boolean> getStdinOnce() {
        return Optional.ofNullable(this.stdinOnce);
    }
    /**
     * If set, the name of the container from PodSpec that this ephemeral container targets. The ephemeral container will be run in the namespaces (IPC, PID, etc) of this container. If not set then the ephemeral container uses the namespaces configured in the Pod spec.
     * 
     * The container runtime must implement support for this feature. If the runtime does not support namespace targeting then the result of setting this field is undefined.
     * 
    */
    public Optional<String> getTargetContainerName() {
        return Optional.ofNullable(this.targetContainerName);
    }
    /**
     * Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
     * 
    */
    public Optional<String> getTerminationMessagePath() {
        return Optional.ofNullable(this.terminationMessagePath);
    }
    /**
     * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
     * 
     * Possible enum values:
     *  - `"FallbackToLogsOnError"` will read the most recent contents of the container logs for the container status message when the container exits with an error and the terminationMessagePath has no contents.
     *  - `"File"` is the default behavior and will set the container status message to the contents of the container's terminationMessagePath when the container exits.
     * 
    */
    public Optional<String> getTerminationMessagePolicy() {
        return Optional.ofNullable(this.terminationMessagePolicy);
    }
    /**
     * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.
     * 
    */
    public Optional<Boolean> getTty() {
        return Optional.ofNullable(this.tty);
    }
    /**
     * volumeDevices is the list of block devices to be used by the container.
     * 
    */
    public List<VolumeDevice> getVolumeDevices() {
        return this.volumeDevices == null ? List.of() : this.volumeDevices;
    }
    /**
     * Pod volumes to mount into the container's filesystem. Subpath mounts are not allowed for ephemeral containers. Cannot be updated.
     * 
    */
    public List<VolumeMount> getVolumeMounts() {
        return this.volumeMounts == null ? List.of() : this.volumeMounts;
    }
    /**
     * Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
     * 
    */
    public Optional<String> getWorkingDir() {
        return Optional.ofNullable(this.workingDir);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EphemeralContainer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> args;
        private @Nullable List<String> command;
        private @Nullable List<EnvVar> env;
        private @Nullable List<EnvFromSource> envFrom;
        private @Nullable String image;
        private @Nullable String imagePullPolicy;
        private @Nullable Lifecycle lifecycle;
        private @Nullable Probe livenessProbe;
        private String name;
        private @Nullable List<ContainerPort> ports;
        private @Nullable Probe readinessProbe;
        private @Nullable ResourceRequirements resources;
        private @Nullable SecurityContext securityContext;
        private @Nullable Probe startupProbe;
        private @Nullable Boolean stdin;
        private @Nullable Boolean stdinOnce;
        private @Nullable String targetContainerName;
        private @Nullable String terminationMessagePath;
        private @Nullable String terminationMessagePolicy;
        private @Nullable Boolean tty;
        private @Nullable List<VolumeDevice> volumeDevices;
        private @Nullable List<VolumeMount> volumeMounts;
        private @Nullable String workingDir;

        public Builder() {
    	      // Empty
        }

        public Builder(EphemeralContainer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.command = defaults.command;
    	      this.env = defaults.env;
    	      this.envFrom = defaults.envFrom;
    	      this.image = defaults.image;
    	      this.imagePullPolicy = defaults.imagePullPolicy;
    	      this.lifecycle = defaults.lifecycle;
    	      this.livenessProbe = defaults.livenessProbe;
    	      this.name = defaults.name;
    	      this.ports = defaults.ports;
    	      this.readinessProbe = defaults.readinessProbe;
    	      this.resources = defaults.resources;
    	      this.securityContext = defaults.securityContext;
    	      this.startupProbe = defaults.startupProbe;
    	      this.stdin = defaults.stdin;
    	      this.stdinOnce = defaults.stdinOnce;
    	      this.targetContainerName = defaults.targetContainerName;
    	      this.terminationMessagePath = defaults.terminationMessagePath;
    	      this.terminationMessagePolicy = defaults.terminationMessagePolicy;
    	      this.tty = defaults.tty;
    	      this.volumeDevices = defaults.volumeDevices;
    	      this.volumeMounts = defaults.volumeMounts;
    	      this.workingDir = defaults.workingDir;
        }

        public Builder args(@Nullable List<String> args) {
            this.args = args;
            return this;
        }

        public Builder command(@Nullable List<String> command) {
            this.command = command;
            return this;
        }

        public Builder env(@Nullable List<EnvVar> env) {
            this.env = env;
            return this;
        }

        public Builder envFrom(@Nullable List<EnvFromSource> envFrom) {
            this.envFrom = envFrom;
            return this;
        }

        public Builder image(@Nullable String image) {
            this.image = image;
            return this;
        }

        public Builder imagePullPolicy(@Nullable String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }

        public Builder lifecycle(@Nullable Lifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        public Builder livenessProbe(@Nullable Probe livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder ports(@Nullable List<ContainerPort> ports) {
            this.ports = ports;
            return this;
        }

        public Builder readinessProbe(@Nullable Probe readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }

        public Builder resources(@Nullable ResourceRequirements resources) {
            this.resources = resources;
            return this;
        }

        public Builder securityContext(@Nullable SecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }

        public Builder startupProbe(@Nullable Probe startupProbe) {
            this.startupProbe = startupProbe;
            return this;
        }

        public Builder stdin(@Nullable Boolean stdin) {
            this.stdin = stdin;
            return this;
        }

        public Builder stdinOnce(@Nullable Boolean stdinOnce) {
            this.stdinOnce = stdinOnce;
            return this;
        }

        public Builder targetContainerName(@Nullable String targetContainerName) {
            this.targetContainerName = targetContainerName;
            return this;
        }

        public Builder terminationMessagePath(@Nullable String terminationMessagePath) {
            this.terminationMessagePath = terminationMessagePath;
            return this;
        }

        public Builder terminationMessagePolicy(@Nullable String terminationMessagePolicy) {
            this.terminationMessagePolicy = terminationMessagePolicy;
            return this;
        }

        public Builder tty(@Nullable Boolean tty) {
            this.tty = tty;
            return this;
        }

        public Builder volumeDevices(@Nullable List<VolumeDevice> volumeDevices) {
            this.volumeDevices = volumeDevices;
            return this;
        }

        public Builder volumeMounts(@Nullable List<VolumeMount> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }

        public Builder workingDir(@Nullable String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public EphemeralContainer build() {
            return new EphemeralContainer(args, command, env, envFrom, image, imagePullPolicy, lifecycle, livenessProbe, name, ports, readinessProbe, resources, securityContext, startupProbe, stdin, stdinOnce, targetContainerName, terminationMessagePath, terminationMessagePolicy, tty, volumeDevices, volumeMounts, workingDir);
        }
    }
}
