// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.run_v1alpha1.outputs.ContainerPortResponse;
import io.pulumi.googlenative.run_v1alpha1.outputs.EnvFromSourceResponse;
import io.pulumi.googlenative.run_v1alpha1.outputs.EnvVarResponse;
import io.pulumi.googlenative.run_v1alpha1.outputs.ProbeResponse;
import io.pulumi.googlenative.run_v1alpha1.outputs.ResourceRequirementsResponse;
import io.pulumi.googlenative.run_v1alpha1.outputs.SecurityContextResponse;
import io.pulumi.googlenative.run_v1alpha1.outputs.VolumeMountResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ContainerResponse {
    /**
     * (Optional) Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    private final List<String> args;
    private final List<String> command;
    /**
     * (Optional) List of environment variables to set in the container.
     * 
     */
    private final List<EnvVarResponse> env;
    /**
     * (Optional) List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
     * 
     */
    private final List<EnvFromSourceResponse> envFrom;
    /**
     * Only supports containers from Google Container Registry or Artifact Registry URL of the Container image. More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    private final String image;
    /**
     * (Optional) Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     * 
     */
    private final String imagePullPolicy;
    /**
     * (Optional) Periodic probe of container liveness. Container will be restarted if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    private final ProbeResponse livenessProbe;
    /**
     * (Optional) Name of the container specified as a DNS_LABEL. Currently unused in Cloud Run. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-label-names
     * 
     */
    private final String name;
    /**
     * (Optional) List of ports to expose from the container. Only a single port can be specified. The specified ports must be listening on all interfaces (0.0.0.0) within the container to be accessible. If omitted, a port number will be chosen and passed to the container through the PORT environment variable for the container to listen on.
     * 
     */
    private final List<ContainerPortResponse> ports;
    /**
     * (Optional) Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    private final ProbeResponse readinessProbe;
    /**
     * (Optional) Compute Resources required by this container. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
     * 
     */
    private final ResourceRequirementsResponse resources;
    /**
     * (Optional) Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * 
     */
    private final SecurityContextResponse securityContext;
    /**
     * (Optional) Startup probe of application within the container. All other probes are disabled if a startup probe is provided, until it succeeds. Container will not be added to service endpoints if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    private final ProbeResponse startupProbe;
    /**
     * (Optional) Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log.
     * 
     */
    private final String terminationMessagePath;
    /**
     * (Optional) Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
     * 
     */
    private final String terminationMessagePolicy;
    /**
     * (Optional) Volume to mount into the container's filesystem. Only supports SecretVolumeSources. Pod volumes to mount into the container's filesystem.
     * 
     */
    private final List<VolumeMountResponse> volumeMounts;
    /**
     * (Optional) Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image.
     * 
     */
    private final String workingDir;

    @OutputCustomType.Constructor({"args","command","env","envFrom","image","imagePullPolicy","livenessProbe","name","ports","readinessProbe","resources","securityContext","startupProbe","terminationMessagePath","terminationMessagePolicy","volumeMounts","workingDir"})
    private ContainerResponse(
        List<String> args,
        List<String> command,
        List<EnvVarResponse> env,
        List<EnvFromSourceResponse> envFrom,
        String image,
        String imagePullPolicy,
        ProbeResponse livenessProbe,
        String name,
        List<ContainerPortResponse> ports,
        ProbeResponse readinessProbe,
        ResourceRequirementsResponse resources,
        SecurityContextResponse securityContext,
        ProbeResponse startupProbe,
        String terminationMessagePath,
        String terminationMessagePolicy,
        List<VolumeMountResponse> volumeMounts,
        String workingDir) {
        this.args = args;
        this.command = command;
        this.env = env;
        this.envFrom = envFrom;
        this.image = image;
        this.imagePullPolicy = imagePullPolicy;
        this.livenessProbe = livenessProbe;
        this.name = name;
        this.ports = ports;
        this.readinessProbe = readinessProbe;
        this.resources = resources;
        this.securityContext = securityContext;
        this.startupProbe = startupProbe;
        this.terminationMessagePath = terminationMessagePath;
        this.terminationMessagePolicy = terminationMessagePolicy;
        this.volumeMounts = volumeMounts;
        this.workingDir = workingDir;
    }

    /**
     * (Optional) Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
    */
    public List<String> getArgs() {
        return this.args;
    }
    public List<String> getCommand() {
        return this.command;
    }
    /**
     * (Optional) List of environment variables to set in the container.
     * 
    */
    public List<EnvVarResponse> getEnv() {
        return this.env;
    }
    /**
     * (Optional) List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
     * 
    */
    public List<EnvFromSourceResponse> getEnvFrom() {
        return this.envFrom;
    }
    /**
     * Only supports containers from Google Container Registry or Artifact Registry URL of the Container image. More info: https://kubernetes.io/docs/concepts/containers/images
     * 
    */
    public String getImage() {
        return this.image;
    }
    /**
     * (Optional) Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     * 
    */
    public String getImagePullPolicy() {
        return this.imagePullPolicy;
    }
    /**
     * (Optional) Periodic probe of container liveness. Container will be restarted if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
    */
    public ProbeResponse getLivenessProbe() {
        return this.livenessProbe;
    }
    /**
     * (Optional) Name of the container specified as a DNS_LABEL. Currently unused in Cloud Run. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-label-names
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * (Optional) List of ports to expose from the container. Only a single port can be specified. The specified ports must be listening on all interfaces (0.0.0.0) within the container to be accessible. If omitted, a port number will be chosen and passed to the container through the PORT environment variable for the container to listen on.
     * 
    */
    public List<ContainerPortResponse> getPorts() {
        return this.ports;
    }
    /**
     * (Optional) Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
    */
    public ProbeResponse getReadinessProbe() {
        return this.readinessProbe;
    }
    /**
     * (Optional) Compute Resources required by this container. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
     * 
    */
    public ResourceRequirementsResponse getResources() {
        return this.resources;
    }
    /**
     * (Optional) Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * 
    */
    public SecurityContextResponse getSecurityContext() {
        return this.securityContext;
    }
    /**
     * (Optional) Startup probe of application within the container. All other probes are disabled if a startup probe is provided, until it succeeds. Container will not be added to service endpoints if the probe fails. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
    */
    public ProbeResponse getStartupProbe() {
        return this.startupProbe;
    }
    /**
     * (Optional) Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log.
     * 
    */
    public String getTerminationMessagePath() {
        return this.terminationMessagePath;
    }
    /**
     * (Optional) Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
     * 
    */
    public String getTerminationMessagePolicy() {
        return this.terminationMessagePolicy;
    }
    /**
     * (Optional) Volume to mount into the container's filesystem. Only supports SecretVolumeSources. Pod volumes to mount into the container's filesystem.
     * 
    */
    public List<VolumeMountResponse> getVolumeMounts() {
        return this.volumeMounts;
    }
    /**
     * (Optional) Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image.
     * 
    */
    public String getWorkingDir() {
        return this.workingDir;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> args;
        private List<String> command;
        private List<EnvVarResponse> env;
        private List<EnvFromSourceResponse> envFrom;
        private String image;
        private String imagePullPolicy;
        private ProbeResponse livenessProbe;
        private String name;
        private List<ContainerPortResponse> ports;
        private ProbeResponse readinessProbe;
        private ResourceRequirementsResponse resources;
        private SecurityContextResponse securityContext;
        private ProbeResponse startupProbe;
        private String terminationMessagePath;
        private String terminationMessagePolicy;
        private List<VolumeMountResponse> volumeMounts;
        private String workingDir;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.command = defaults.command;
    	      this.env = defaults.env;
    	      this.envFrom = defaults.envFrom;
    	      this.image = defaults.image;
    	      this.imagePullPolicy = defaults.imagePullPolicy;
    	      this.livenessProbe = defaults.livenessProbe;
    	      this.name = defaults.name;
    	      this.ports = defaults.ports;
    	      this.readinessProbe = defaults.readinessProbe;
    	      this.resources = defaults.resources;
    	      this.securityContext = defaults.securityContext;
    	      this.startupProbe = defaults.startupProbe;
    	      this.terminationMessagePath = defaults.terminationMessagePath;
    	      this.terminationMessagePolicy = defaults.terminationMessagePolicy;
    	      this.volumeMounts = defaults.volumeMounts;
    	      this.workingDir = defaults.workingDir;
        }

        public Builder setArgs(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }

        public Builder setCommand(List<String> command) {
            this.command = Objects.requireNonNull(command);
            return this;
        }

        public Builder setEnv(List<EnvVarResponse> env) {
            this.env = Objects.requireNonNull(env);
            return this;
        }

        public Builder setEnvFrom(List<EnvFromSourceResponse> envFrom) {
            this.envFrom = Objects.requireNonNull(envFrom);
            return this;
        }

        public Builder setImage(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = Objects.requireNonNull(imagePullPolicy);
            return this;
        }

        public Builder setLivenessProbe(ProbeResponse livenessProbe) {
            this.livenessProbe = Objects.requireNonNull(livenessProbe);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPorts(List<ContainerPortResponse> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }

        public Builder setReadinessProbe(ProbeResponse readinessProbe) {
            this.readinessProbe = Objects.requireNonNull(readinessProbe);
            return this;
        }

        public Builder setResources(ResourceRequirementsResponse resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder setSecurityContext(SecurityContextResponse securityContext) {
            this.securityContext = Objects.requireNonNull(securityContext);
            return this;
        }

        public Builder setStartupProbe(ProbeResponse startupProbe) {
            this.startupProbe = Objects.requireNonNull(startupProbe);
            return this;
        }

        public Builder setTerminationMessagePath(String terminationMessagePath) {
            this.terminationMessagePath = Objects.requireNonNull(terminationMessagePath);
            return this;
        }

        public Builder setTerminationMessagePolicy(String terminationMessagePolicy) {
            this.terminationMessagePolicy = Objects.requireNonNull(terminationMessagePolicy);
            return this;
        }

        public Builder setVolumeMounts(List<VolumeMountResponse> volumeMounts) {
            this.volumeMounts = Objects.requireNonNull(volumeMounts);
            return this;
        }

        public Builder setWorkingDir(String workingDir) {
            this.workingDir = Objects.requireNonNull(workingDir);
            return this;
        }
        public ContainerResponse build() {
            return new ContainerResponse(args, command, env, envFrom, image, imagePullPolicy, livenessProbe, name, ports, readinessProbe, resources, securityContext, startupProbe, terminationMessagePath, terminationMessagePolicy, volumeMounts, workingDir);
        }
    }
}
