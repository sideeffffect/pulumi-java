// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run_v1.inputs.ContainerPortResponse;
import com.pulumi.googlenative.run_v1.inputs.EnvFromSourceResponse;
import com.pulumi.googlenative.run_v1.inputs.EnvVarResponse;
import com.pulumi.googlenative.run_v1.inputs.ProbeResponse;
import com.pulumi.googlenative.run_v1.inputs.ResourceRequirementsResponse;
import com.pulumi.googlenative.run_v1.inputs.SecurityContextResponse;
import com.pulumi.googlenative.run_v1.inputs.VolumeMountResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A single application container. This specifies both the container to run, the command to run in the container and the arguments to supply to it. Note that additional arguments may be supplied by the system to the container at runtime.
 * 
 */
public final class ContainerResponse extends com.pulumi.resources.InvokeArgs {

    public static final ContainerResponse Empty = new ContainerResponse();

    /**
     * (Optional) Arguments to the entrypoint. The docker image&#39;s CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @Import(name="args", required=true)
    private List<String> args;

    public List<String> args() {
        return this.args;
    }

    @Import(name="command", required=true)
    private List<String> command;

    public List<String> command() {
        return this.command;
    }

    /**
     * (Optional) List of environment variables to set in the container.
     * 
     */
    @Import(name="env", required=true)
    private List<EnvVarResponse> env;

    public List<EnvVarResponse> env() {
        return this.env;
    }

    /**
     * (Optional) List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
     * 
     */
    @Import(name="envFrom", required=true)
    private List<EnvFromSourceResponse> envFrom;

    public List<EnvFromSourceResponse> envFrom() {
        return this.envFrom;
    }

    /**
     * Only supports containers from Google Container Registry or Artifact Registry URL of the Container image. More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    @Import(name="image", required=true)
    private String image;

    public String image() {
        return this.image;
    }

    /**
     * (Optional) Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     * 
     */
    @Import(name="imagePullPolicy", required=true)
    private String imagePullPolicy;

    public String imagePullPolicy() {
        return this.imagePullPolicy;
    }

    /**
     * (Optional) Periodic probe of container liveness. Container will be restarted if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @Import(name="livenessProbe", required=true)
    private ProbeResponse livenessProbe;

    public ProbeResponse livenessProbe() {
        return this.livenessProbe;
    }

    /**
     * (Optional) Name of the container specified as a DNS_LABEL. Currently unused in Cloud Run. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-label-names
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * (Optional) List of ports to expose from the container. Only a single port can be specified. The specified ports must be listening on all interfaces (0.0.0.0) within the container to be accessible. If omitted, a port number will be chosen and passed to the container through the PORT environment variable for the container to listen on.
     * 
     */
    @Import(name="ports", required=true)
    private List<ContainerPortResponse> ports;

    public List<ContainerPortResponse> ports() {
        return this.ports;
    }

    /**
     * (Optional) Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @Import(name="readinessProbe", required=true)
    private ProbeResponse readinessProbe;

    public ProbeResponse readinessProbe() {
        return this.readinessProbe;
    }

    /**
     * (Optional) Compute Resources required by this container. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
     * 
     */
    @Import(name="resources", required=true)
    private ResourceRequirementsResponse resources;

    public ResourceRequirementsResponse resources() {
        return this.resources;
    }

    /**
     * (Optional) Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * 
     */
    @Import(name="securityContext", required=true)
    private SecurityContextResponse securityContext;

    public SecurityContextResponse securityContext() {
        return this.securityContext;
    }

    /**
     * (Optional) Startup probe of application within the container. All other probes are disabled if a startup probe is provided, until it succeeds. Container will not be added to service endpoints if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @Import(name="startupProbe", required=true)
    private ProbeResponse startupProbe;

    public ProbeResponse startupProbe() {
        return this.startupProbe;
    }

    /**
     * (Optional) Path at which the file to which the container&#39;s termination message will be written is mounted into the container&#39;s filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log.
     * 
     */
    @Import(name="terminationMessagePath", required=true)
    private String terminationMessagePath;

    public String terminationMessagePath() {
        return this.terminationMessagePath;
    }

    /**
     * (Optional) Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
     * 
     */
    @Import(name="terminationMessagePolicy", required=true)
    private String terminationMessagePolicy;

    public String terminationMessagePolicy() {
        return this.terminationMessagePolicy;
    }

    /**
     * (Optional) Volume to mount into the container&#39;s filesystem. Only supports SecretVolumeSources. Pod volumes to mount into the container&#39;s filesystem.
     * 
     */
    @Import(name="volumeMounts", required=true)
    private List<VolumeMountResponse> volumeMounts;

    public List<VolumeMountResponse> volumeMounts() {
        return this.volumeMounts;
    }

    /**
     * (Optional) Container&#39;s working directory. If not specified, the container runtime&#39;s default will be used, which might be configured in the container image.
     * 
     */
    @Import(name="workingDir", required=true)
    private String workingDir;

    public String workingDir() {
        return this.workingDir;
    }

    private ContainerResponse() {}

    private ContainerResponse(ContainerResponse $) {
        this.args = $.args;
        this.command = $.command;
        this.env = $.env;
        this.envFrom = $.envFrom;
        this.image = $.image;
        this.imagePullPolicy = $.imagePullPolicy;
        this.livenessProbe = $.livenessProbe;
        this.name = $.name;
        this.ports = $.ports;
        this.readinessProbe = $.readinessProbe;
        this.resources = $.resources;
        this.securityContext = $.securityContext;
        this.startupProbe = $.startupProbe;
        this.terminationMessagePath = $.terminationMessagePath;
        this.terminationMessagePolicy = $.terminationMessagePolicy;
        this.volumeMounts = $.volumeMounts;
        this.workingDir = $.workingDir;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerResponse $;

        public Builder() {
            $ = new ContainerResponse();
        }

        public Builder(ContainerResponse defaults) {
            $ = new ContainerResponse(Objects.requireNonNull(defaults));
        }

        public Builder args(List<String> args) {
            $.args = args;
            return this;
        }

        public Builder args(String... args) {
            return args(List.of(args));
        }

        public Builder command(List<String> command) {
            $.command = command;
            return this;
        }

        public Builder command(String... command) {
            return command(List.of(command));
        }

        public Builder env(List<EnvVarResponse> env) {
            $.env = env;
            return this;
        }

        public Builder env(EnvVarResponse... env) {
            return env(List.of(env));
        }

        public Builder envFrom(List<EnvFromSourceResponse> envFrom) {
            $.envFrom = envFrom;
            return this;
        }

        public Builder envFrom(EnvFromSourceResponse... envFrom) {
            return envFrom(List.of(envFrom));
        }

        public Builder image(String image) {
            $.image = image;
            return this;
        }

        public Builder imagePullPolicy(String imagePullPolicy) {
            $.imagePullPolicy = imagePullPolicy;
            return this;
        }

        public Builder livenessProbe(ProbeResponse livenessProbe) {
            $.livenessProbe = livenessProbe;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder ports(List<ContainerPortResponse> ports) {
            $.ports = ports;
            return this;
        }

        public Builder ports(ContainerPortResponse... ports) {
            return ports(List.of(ports));
        }

        public Builder readinessProbe(ProbeResponse readinessProbe) {
            $.readinessProbe = readinessProbe;
            return this;
        }

        public Builder resources(ResourceRequirementsResponse resources) {
            $.resources = resources;
            return this;
        }

        public Builder securityContext(SecurityContextResponse securityContext) {
            $.securityContext = securityContext;
            return this;
        }

        public Builder startupProbe(ProbeResponse startupProbe) {
            $.startupProbe = startupProbe;
            return this;
        }

        public Builder terminationMessagePath(String terminationMessagePath) {
            $.terminationMessagePath = terminationMessagePath;
            return this;
        }

        public Builder terminationMessagePolicy(String terminationMessagePolicy) {
            $.terminationMessagePolicy = terminationMessagePolicy;
            return this;
        }

        public Builder volumeMounts(List<VolumeMountResponse> volumeMounts) {
            $.volumeMounts = volumeMounts;
            return this;
        }

        public Builder volumeMounts(VolumeMountResponse... volumeMounts) {
            return volumeMounts(List.of(volumeMounts));
        }

        public Builder workingDir(String workingDir) {
            $.workingDir = workingDir;
            return this;
        }

        public ContainerResponse build() {
            $.args = Objects.requireNonNull($.args, "expected parameter 'args' to be non-null");
            $.command = Objects.requireNonNull($.command, "expected parameter 'command' to be non-null");
            $.env = Objects.requireNonNull($.env, "expected parameter 'env' to be non-null");
            $.envFrom = Objects.requireNonNull($.envFrom, "expected parameter 'envFrom' to be non-null");
            $.image = Objects.requireNonNull($.image, "expected parameter 'image' to be non-null");
            $.imagePullPolicy = Objects.requireNonNull($.imagePullPolicy, "expected parameter 'imagePullPolicy' to be non-null");
            $.livenessProbe = Objects.requireNonNull($.livenessProbe, "expected parameter 'livenessProbe' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.ports = Objects.requireNonNull($.ports, "expected parameter 'ports' to be non-null");
            $.readinessProbe = Objects.requireNonNull($.readinessProbe, "expected parameter 'readinessProbe' to be non-null");
            $.resources = Objects.requireNonNull($.resources, "expected parameter 'resources' to be non-null");
            $.securityContext = Objects.requireNonNull($.securityContext, "expected parameter 'securityContext' to be non-null");
            $.startupProbe = Objects.requireNonNull($.startupProbe, "expected parameter 'startupProbe' to be non-null");
            $.terminationMessagePath = Objects.requireNonNull($.terminationMessagePath, "expected parameter 'terminationMessagePath' to be non-null");
            $.terminationMessagePolicy = Objects.requireNonNull($.terminationMessagePolicy, "expected parameter 'terminationMessagePolicy' to be non-null");
            $.volumeMounts = Objects.requireNonNull($.volumeMounts, "expected parameter 'volumeMounts' to be non-null");
            $.workingDir = Objects.requireNonNull($.workingDir, "expected parameter 'workingDir' to be non-null");
            return $;
        }
    }

}
