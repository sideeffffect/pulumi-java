// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.awsnative.ecs.inputs.TaskDefinitionContainerDependencyArgs;
import io.pulumi.awsnative.ecs.inputs.TaskDefinitionEnvironmentFileArgs;
import io.pulumi.awsnative.ecs.inputs.TaskDefinitionFirelensConfigurationArgs;
import io.pulumi.awsnative.ecs.inputs.TaskDefinitionHealthCheckArgs;
import io.pulumi.awsnative.ecs.inputs.TaskDefinitionHostEntryArgs;
import io.pulumi.awsnative.ecs.inputs.TaskDefinitionKeyValuePairArgs;
import io.pulumi.awsnative.ecs.inputs.TaskDefinitionLinuxParametersArgs;
import io.pulumi.awsnative.ecs.inputs.TaskDefinitionLogConfigurationArgs;
import io.pulumi.awsnative.ecs.inputs.TaskDefinitionMountPointArgs;
import io.pulumi.awsnative.ecs.inputs.TaskDefinitionPortMappingArgs;
import io.pulumi.awsnative.ecs.inputs.TaskDefinitionRepositoryCredentialsArgs;
import io.pulumi.awsnative.ecs.inputs.TaskDefinitionResourceRequirementArgs;
import io.pulumi.awsnative.ecs.inputs.TaskDefinitionSecretArgs;
import io.pulumi.awsnative.ecs.inputs.TaskDefinitionSystemControlArgs;
import io.pulumi.awsnative.ecs.inputs.TaskDefinitionUlimitArgs;
import io.pulumi.awsnative.ecs.inputs.TaskDefinitionVolumeFromArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * List of container definitions that are passed to the Docker daemon on a container instance
 * 
 */
public final class TaskDefinitionContainerDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionContainerDefinitionArgs Empty = new TaskDefinitionContainerDefinitionArgs();

    @InputImport(name="command")
      private final @Nullable Input<List<String>> command;

    public Input<List<String>> getCommand() {
        return this.command == null ? Input.empty() : this.command;
    }

    @InputImport(name="cpu")
      private final @Nullable Input<Integer> cpu;

    public Input<Integer> getCpu() {
        return this.cpu == null ? Input.empty() : this.cpu;
    }

    @InputImport(name="dependsOn")
      private final @Nullable Input<List<TaskDefinitionContainerDependencyArgs>> dependsOn;

    public Input<List<TaskDefinitionContainerDependencyArgs>> getDependsOn() {
        return this.dependsOn == null ? Input.empty() : this.dependsOn;
    }

    @InputImport(name="disableNetworking")
      private final @Nullable Input<Boolean> disableNetworking;

    public Input<Boolean> getDisableNetworking() {
        return this.disableNetworking == null ? Input.empty() : this.disableNetworking;
    }

    @InputImport(name="dnsSearchDomains")
      private final @Nullable Input<List<String>> dnsSearchDomains;

    public Input<List<String>> getDnsSearchDomains() {
        return this.dnsSearchDomains == null ? Input.empty() : this.dnsSearchDomains;
    }

    @InputImport(name="dnsServers")
      private final @Nullable Input<List<String>> dnsServers;

    public Input<List<String>> getDnsServers() {
        return this.dnsServers == null ? Input.empty() : this.dnsServers;
    }

    @InputImport(name="dockerLabels")
      private final @Nullable Input<Object> dockerLabels;

    public Input<Object> getDockerLabels() {
        return this.dockerLabels == null ? Input.empty() : this.dockerLabels;
    }

    @InputImport(name="dockerSecurityOptions")
      private final @Nullable Input<List<String>> dockerSecurityOptions;

    public Input<List<String>> getDockerSecurityOptions() {
        return this.dockerSecurityOptions == null ? Input.empty() : this.dockerSecurityOptions;
    }

    @InputImport(name="entryPoint")
      private final @Nullable Input<List<String>> entryPoint;

    public Input<List<String>> getEntryPoint() {
        return this.entryPoint == null ? Input.empty() : this.entryPoint;
    }

    /**
     * The environment variables to pass to a container
     * 
     */
    @InputImport(name="environment")
      private final @Nullable Input<List<TaskDefinitionKeyValuePairArgs>> environment;

    public Input<List<TaskDefinitionKeyValuePairArgs>> getEnvironment() {
        return this.environment == null ? Input.empty() : this.environment;
    }

    /**
     * The list of one or more files that contain the environment variables to pass to a container
     * 
     */
    @InputImport(name="environmentFiles")
      private final @Nullable Input<List<TaskDefinitionEnvironmentFileArgs>> environmentFiles;

    public Input<List<TaskDefinitionEnvironmentFileArgs>> getEnvironmentFiles() {
        return this.environmentFiles == null ? Input.empty() : this.environmentFiles;
    }

    @InputImport(name="essential")
      private final @Nullable Input<Boolean> essential;

    public Input<Boolean> getEssential() {
        return this.essential == null ? Input.empty() : this.essential;
    }

    @InputImport(name="extraHosts")
      private final @Nullable Input<List<TaskDefinitionHostEntryArgs>> extraHosts;

    public Input<List<TaskDefinitionHostEntryArgs>> getExtraHosts() {
        return this.extraHosts == null ? Input.empty() : this.extraHosts;
    }

    @InputImport(name="firelensConfiguration")
      private final @Nullable Input<TaskDefinitionFirelensConfigurationArgs> firelensConfiguration;

    public Input<TaskDefinitionFirelensConfigurationArgs> getFirelensConfiguration() {
        return this.firelensConfiguration == null ? Input.empty() : this.firelensConfiguration;
    }

    @InputImport(name="healthCheck")
      private final @Nullable Input<TaskDefinitionHealthCheckArgs> healthCheck;

    public Input<TaskDefinitionHealthCheckArgs> getHealthCheck() {
        return this.healthCheck == null ? Input.empty() : this.healthCheck;
    }

    @InputImport(name="hostname")
      private final @Nullable Input<String> hostname;

    public Input<String> getHostname() {
        return this.hostname == null ? Input.empty() : this.hostname;
    }

    /**
     * The image used to start a container. This string is passed directly to the Docker daemon.
     * 
     */
    @InputImport(name="image")
      private final @Nullable Input<String> image;

    public Input<String> getImage() {
        return this.image == null ? Input.empty() : this.image;
    }

    @InputImport(name="interactive")
      private final @Nullable Input<Boolean> interactive;

    public Input<Boolean> getInteractive() {
        return this.interactive == null ? Input.empty() : this.interactive;
    }

    @InputImport(name="links")
      private final @Nullable Input<List<String>> links;

    public Input<List<String>> getLinks() {
        return this.links == null ? Input.empty() : this.links;
    }

    @InputImport(name="linuxParameters")
      private final @Nullable Input<TaskDefinitionLinuxParametersArgs> linuxParameters;

    public Input<TaskDefinitionLinuxParametersArgs> getLinuxParameters() {
        return this.linuxParameters == null ? Input.empty() : this.linuxParameters;
    }

    @InputImport(name="logConfiguration")
      private final @Nullable Input<TaskDefinitionLogConfigurationArgs> logConfiguration;

    public Input<TaskDefinitionLogConfigurationArgs> getLogConfiguration() {
        return this.logConfiguration == null ? Input.empty() : this.logConfiguration;
    }

    /**
     * The amount (in MiB) of memory to present to the container. If your container attempts to exceed the memory specified here, the container is killed.
     * 
     */
    @InputImport(name="memory")
      private final @Nullable Input<Integer> memory;

    public Input<Integer> getMemory() {
        return this.memory == null ? Input.empty() : this.memory;
    }

    @InputImport(name="memoryReservation")
      private final @Nullable Input<Integer> memoryReservation;

    public Input<Integer> getMemoryReservation() {
        return this.memoryReservation == null ? Input.empty() : this.memoryReservation;
    }

    @InputImport(name="mountPoints")
      private final @Nullable Input<List<TaskDefinitionMountPointArgs>> mountPoints;

    public Input<List<TaskDefinitionMountPointArgs>> getMountPoints() {
        return this.mountPoints == null ? Input.empty() : this.mountPoints;
    }

    /**
     * The name of a container. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Port mappings allow containers to access ports on the host container instance to send or receive traffic.
     * 
     */
    @InputImport(name="portMappings")
      private final @Nullable Input<List<TaskDefinitionPortMappingArgs>> portMappings;

    public Input<List<TaskDefinitionPortMappingArgs>> getPortMappings() {
        return this.portMappings == null ? Input.empty() : this.portMappings;
    }

    @InputImport(name="privileged")
      private final @Nullable Input<Boolean> privileged;

    public Input<Boolean> getPrivileged() {
        return this.privileged == null ? Input.empty() : this.privileged;
    }

    @InputImport(name="pseudoTerminal")
      private final @Nullable Input<Boolean> pseudoTerminal;

    public Input<Boolean> getPseudoTerminal() {
        return this.pseudoTerminal == null ? Input.empty() : this.pseudoTerminal;
    }

    @InputImport(name="readonlyRootFilesystem")
      private final @Nullable Input<Boolean> readonlyRootFilesystem;

    public Input<Boolean> getReadonlyRootFilesystem() {
        return this.readonlyRootFilesystem == null ? Input.empty() : this.readonlyRootFilesystem;
    }

    @InputImport(name="repositoryCredentials")
      private final @Nullable Input<TaskDefinitionRepositoryCredentialsArgs> repositoryCredentials;

    public Input<TaskDefinitionRepositoryCredentialsArgs> getRepositoryCredentials() {
        return this.repositoryCredentials == null ? Input.empty() : this.repositoryCredentials;
    }

    @InputImport(name="resourceRequirements")
      private final @Nullable Input<List<TaskDefinitionResourceRequirementArgs>> resourceRequirements;

    public Input<List<TaskDefinitionResourceRequirementArgs>> getResourceRequirements() {
        return this.resourceRequirements == null ? Input.empty() : this.resourceRequirements;
    }

    @InputImport(name="secrets")
      private final @Nullable Input<List<TaskDefinitionSecretArgs>> secrets;

    public Input<List<TaskDefinitionSecretArgs>> getSecrets() {
        return this.secrets == null ? Input.empty() : this.secrets;
    }

    @InputImport(name="startTimeout")
      private final @Nullable Input<Integer> startTimeout;

    public Input<Integer> getStartTimeout() {
        return this.startTimeout == null ? Input.empty() : this.startTimeout;
    }

    @InputImport(name="stopTimeout")
      private final @Nullable Input<Integer> stopTimeout;

    public Input<Integer> getStopTimeout() {
        return this.stopTimeout == null ? Input.empty() : this.stopTimeout;
    }

    @InputImport(name="systemControls")
      private final @Nullable Input<List<TaskDefinitionSystemControlArgs>> systemControls;

    public Input<List<TaskDefinitionSystemControlArgs>> getSystemControls() {
        return this.systemControls == null ? Input.empty() : this.systemControls;
    }

    @InputImport(name="ulimits")
      private final @Nullable Input<List<TaskDefinitionUlimitArgs>> ulimits;

    public Input<List<TaskDefinitionUlimitArgs>> getUlimits() {
        return this.ulimits == null ? Input.empty() : this.ulimits;
    }

    @InputImport(name="user")
      private final @Nullable Input<String> user;

    public Input<String> getUser() {
        return this.user == null ? Input.empty() : this.user;
    }

    @InputImport(name="volumesFrom")
      private final @Nullable Input<List<TaskDefinitionVolumeFromArgs>> volumesFrom;

    public Input<List<TaskDefinitionVolumeFromArgs>> getVolumesFrom() {
        return this.volumesFrom == null ? Input.empty() : this.volumesFrom;
    }

    @InputImport(name="workingDirectory")
      private final @Nullable Input<String> workingDirectory;

    public Input<String> getWorkingDirectory() {
        return this.workingDirectory == null ? Input.empty() : this.workingDirectory;
    }

    public TaskDefinitionContainerDefinitionArgs(
        @Nullable Input<List<String>> command,
        @Nullable Input<Integer> cpu,
        @Nullable Input<List<TaskDefinitionContainerDependencyArgs>> dependsOn,
        @Nullable Input<Boolean> disableNetworking,
        @Nullable Input<List<String>> dnsSearchDomains,
        @Nullable Input<List<String>> dnsServers,
        @Nullable Input<Object> dockerLabels,
        @Nullable Input<List<String>> dockerSecurityOptions,
        @Nullable Input<List<String>> entryPoint,
        @Nullable Input<List<TaskDefinitionKeyValuePairArgs>> environment,
        @Nullable Input<List<TaskDefinitionEnvironmentFileArgs>> environmentFiles,
        @Nullable Input<Boolean> essential,
        @Nullable Input<List<TaskDefinitionHostEntryArgs>> extraHosts,
        @Nullable Input<TaskDefinitionFirelensConfigurationArgs> firelensConfiguration,
        @Nullable Input<TaskDefinitionHealthCheckArgs> healthCheck,
        @Nullable Input<String> hostname,
        @Nullable Input<String> image,
        @Nullable Input<Boolean> interactive,
        @Nullable Input<List<String>> links,
        @Nullable Input<TaskDefinitionLinuxParametersArgs> linuxParameters,
        @Nullable Input<TaskDefinitionLogConfigurationArgs> logConfiguration,
        @Nullable Input<Integer> memory,
        @Nullable Input<Integer> memoryReservation,
        @Nullable Input<List<TaskDefinitionMountPointArgs>> mountPoints,
        @Nullable Input<String> name,
        @Nullable Input<List<TaskDefinitionPortMappingArgs>> portMappings,
        @Nullable Input<Boolean> privileged,
        @Nullable Input<Boolean> pseudoTerminal,
        @Nullable Input<Boolean> readonlyRootFilesystem,
        @Nullable Input<TaskDefinitionRepositoryCredentialsArgs> repositoryCredentials,
        @Nullable Input<List<TaskDefinitionResourceRequirementArgs>> resourceRequirements,
        @Nullable Input<List<TaskDefinitionSecretArgs>> secrets,
        @Nullable Input<Integer> startTimeout,
        @Nullable Input<Integer> stopTimeout,
        @Nullable Input<List<TaskDefinitionSystemControlArgs>> systemControls,
        @Nullable Input<List<TaskDefinitionUlimitArgs>> ulimits,
        @Nullable Input<String> user,
        @Nullable Input<List<TaskDefinitionVolumeFromArgs>> volumesFrom,
        @Nullable Input<String> workingDirectory) {
        this.command = command;
        this.cpu = cpu;
        this.dependsOn = dependsOn;
        this.disableNetworking = disableNetworking;
        this.dnsSearchDomains = dnsSearchDomains;
        this.dnsServers = dnsServers;
        this.dockerLabels = dockerLabels;
        this.dockerSecurityOptions = dockerSecurityOptions;
        this.entryPoint = entryPoint;
        this.environment = environment;
        this.environmentFiles = environmentFiles;
        this.essential = essential;
        this.extraHosts = extraHosts;
        this.firelensConfiguration = firelensConfiguration;
        this.healthCheck = healthCheck;
        this.hostname = hostname;
        this.image = image;
        this.interactive = interactive;
        this.links = links;
        this.linuxParameters = linuxParameters;
        this.logConfiguration = logConfiguration;
        this.memory = memory;
        this.memoryReservation = memoryReservation;
        this.mountPoints = mountPoints;
        this.name = name;
        this.portMappings = portMappings;
        this.privileged = privileged;
        this.pseudoTerminal = pseudoTerminal;
        this.readonlyRootFilesystem = readonlyRootFilesystem;
        this.repositoryCredentials = repositoryCredentials;
        this.resourceRequirements = resourceRequirements;
        this.secrets = secrets;
        this.startTimeout = startTimeout;
        this.stopTimeout = stopTimeout;
        this.systemControls = systemControls;
        this.ulimits = ulimits;
        this.user = user;
        this.volumesFrom = volumesFrom;
        this.workingDirectory = workingDirectory;
    }

    private TaskDefinitionContainerDefinitionArgs() {
        this.command = Input.empty();
        this.cpu = Input.empty();
        this.dependsOn = Input.empty();
        this.disableNetworking = Input.empty();
        this.dnsSearchDomains = Input.empty();
        this.dnsServers = Input.empty();
        this.dockerLabels = Input.empty();
        this.dockerSecurityOptions = Input.empty();
        this.entryPoint = Input.empty();
        this.environment = Input.empty();
        this.environmentFiles = Input.empty();
        this.essential = Input.empty();
        this.extraHosts = Input.empty();
        this.firelensConfiguration = Input.empty();
        this.healthCheck = Input.empty();
        this.hostname = Input.empty();
        this.image = Input.empty();
        this.interactive = Input.empty();
        this.links = Input.empty();
        this.linuxParameters = Input.empty();
        this.logConfiguration = Input.empty();
        this.memory = Input.empty();
        this.memoryReservation = Input.empty();
        this.mountPoints = Input.empty();
        this.name = Input.empty();
        this.portMappings = Input.empty();
        this.privileged = Input.empty();
        this.pseudoTerminal = Input.empty();
        this.readonlyRootFilesystem = Input.empty();
        this.repositoryCredentials = Input.empty();
        this.resourceRequirements = Input.empty();
        this.secrets = Input.empty();
        this.startTimeout = Input.empty();
        this.stopTimeout = Input.empty();
        this.systemControls = Input.empty();
        this.ulimits = Input.empty();
        this.user = Input.empty();
        this.volumesFrom = Input.empty();
        this.workingDirectory = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionContainerDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> command;
        private @Nullable Input<Integer> cpu;
        private @Nullable Input<List<TaskDefinitionContainerDependencyArgs>> dependsOn;
        private @Nullable Input<Boolean> disableNetworking;
        private @Nullable Input<List<String>> dnsSearchDomains;
        private @Nullable Input<List<String>> dnsServers;
        private @Nullable Input<Object> dockerLabels;
        private @Nullable Input<List<String>> dockerSecurityOptions;
        private @Nullable Input<List<String>> entryPoint;
        private @Nullable Input<List<TaskDefinitionKeyValuePairArgs>> environment;
        private @Nullable Input<List<TaskDefinitionEnvironmentFileArgs>> environmentFiles;
        private @Nullable Input<Boolean> essential;
        private @Nullable Input<List<TaskDefinitionHostEntryArgs>> extraHosts;
        private @Nullable Input<TaskDefinitionFirelensConfigurationArgs> firelensConfiguration;
        private @Nullable Input<TaskDefinitionHealthCheckArgs> healthCheck;
        private @Nullable Input<String> hostname;
        private @Nullable Input<String> image;
        private @Nullable Input<Boolean> interactive;
        private @Nullable Input<List<String>> links;
        private @Nullable Input<TaskDefinitionLinuxParametersArgs> linuxParameters;
        private @Nullable Input<TaskDefinitionLogConfigurationArgs> logConfiguration;
        private @Nullable Input<Integer> memory;
        private @Nullable Input<Integer> memoryReservation;
        private @Nullable Input<List<TaskDefinitionMountPointArgs>> mountPoints;
        private @Nullable Input<String> name;
        private @Nullable Input<List<TaskDefinitionPortMappingArgs>> portMappings;
        private @Nullable Input<Boolean> privileged;
        private @Nullable Input<Boolean> pseudoTerminal;
        private @Nullable Input<Boolean> readonlyRootFilesystem;
        private @Nullable Input<TaskDefinitionRepositoryCredentialsArgs> repositoryCredentials;
        private @Nullable Input<List<TaskDefinitionResourceRequirementArgs>> resourceRequirements;
        private @Nullable Input<List<TaskDefinitionSecretArgs>> secrets;
        private @Nullable Input<Integer> startTimeout;
        private @Nullable Input<Integer> stopTimeout;
        private @Nullable Input<List<TaskDefinitionSystemControlArgs>> systemControls;
        private @Nullable Input<List<TaskDefinitionUlimitArgs>> ulimits;
        private @Nullable Input<String> user;
        private @Nullable Input<List<TaskDefinitionVolumeFromArgs>> volumesFrom;
        private @Nullable Input<String> workingDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionContainerDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.command = defaults.command;
    	      this.cpu = defaults.cpu;
    	      this.dependsOn = defaults.dependsOn;
    	      this.disableNetworking = defaults.disableNetworking;
    	      this.dnsSearchDomains = defaults.dnsSearchDomains;
    	      this.dnsServers = defaults.dnsServers;
    	      this.dockerLabels = defaults.dockerLabels;
    	      this.dockerSecurityOptions = defaults.dockerSecurityOptions;
    	      this.entryPoint = defaults.entryPoint;
    	      this.environment = defaults.environment;
    	      this.environmentFiles = defaults.environmentFiles;
    	      this.essential = defaults.essential;
    	      this.extraHosts = defaults.extraHosts;
    	      this.firelensConfiguration = defaults.firelensConfiguration;
    	      this.healthCheck = defaults.healthCheck;
    	      this.hostname = defaults.hostname;
    	      this.image = defaults.image;
    	      this.interactive = defaults.interactive;
    	      this.links = defaults.links;
    	      this.linuxParameters = defaults.linuxParameters;
    	      this.logConfiguration = defaults.logConfiguration;
    	      this.memory = defaults.memory;
    	      this.memoryReservation = defaults.memoryReservation;
    	      this.mountPoints = defaults.mountPoints;
    	      this.name = defaults.name;
    	      this.portMappings = defaults.portMappings;
    	      this.privileged = defaults.privileged;
    	      this.pseudoTerminal = defaults.pseudoTerminal;
    	      this.readonlyRootFilesystem = defaults.readonlyRootFilesystem;
    	      this.repositoryCredentials = defaults.repositoryCredentials;
    	      this.resourceRequirements = defaults.resourceRequirements;
    	      this.secrets = defaults.secrets;
    	      this.startTimeout = defaults.startTimeout;
    	      this.stopTimeout = defaults.stopTimeout;
    	      this.systemControls = defaults.systemControls;
    	      this.ulimits = defaults.ulimits;
    	      this.user = defaults.user;
    	      this.volumesFrom = defaults.volumesFrom;
    	      this.workingDirectory = defaults.workingDirectory;
        }

        public Builder command(@Nullable Input<List<String>> command) {
            this.command = command;
            return this;
        }

        public Builder command(@Nullable List<String> command) {
            this.command = Input.ofNullable(command);
            return this;
        }

        public Builder cpu(@Nullable Input<Integer> cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder cpu(@Nullable Integer cpu) {
            this.cpu = Input.ofNullable(cpu);
            return this;
        }

        public Builder dependsOn(@Nullable Input<List<TaskDefinitionContainerDependencyArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder dependsOn(@Nullable List<TaskDefinitionContainerDependencyArgs> dependsOn) {
            this.dependsOn = Input.ofNullable(dependsOn);
            return this;
        }

        public Builder disableNetworking(@Nullable Input<Boolean> disableNetworking) {
            this.disableNetworking = disableNetworking;
            return this;
        }

        public Builder disableNetworking(@Nullable Boolean disableNetworking) {
            this.disableNetworking = Input.ofNullable(disableNetworking);
            return this;
        }

        public Builder dnsSearchDomains(@Nullable Input<List<String>> dnsSearchDomains) {
            this.dnsSearchDomains = dnsSearchDomains;
            return this;
        }

        public Builder dnsSearchDomains(@Nullable List<String> dnsSearchDomains) {
            this.dnsSearchDomains = Input.ofNullable(dnsSearchDomains);
            return this;
        }

        public Builder dnsServers(@Nullable Input<List<String>> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        public Builder dnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = Input.ofNullable(dnsServers);
            return this;
        }

        public Builder dockerLabels(@Nullable Input<Object> dockerLabels) {
            this.dockerLabels = dockerLabels;
            return this;
        }

        public Builder dockerLabels(@Nullable Object dockerLabels) {
            this.dockerLabels = Input.ofNullable(dockerLabels);
            return this;
        }

        public Builder dockerSecurityOptions(@Nullable Input<List<String>> dockerSecurityOptions) {
            this.dockerSecurityOptions = dockerSecurityOptions;
            return this;
        }

        public Builder dockerSecurityOptions(@Nullable List<String> dockerSecurityOptions) {
            this.dockerSecurityOptions = Input.ofNullable(dockerSecurityOptions);
            return this;
        }

        public Builder entryPoint(@Nullable Input<List<String>> entryPoint) {
            this.entryPoint = entryPoint;
            return this;
        }

        public Builder entryPoint(@Nullable List<String> entryPoint) {
            this.entryPoint = Input.ofNullable(entryPoint);
            return this;
        }

        public Builder environment(@Nullable Input<List<TaskDefinitionKeyValuePairArgs>> environment) {
            this.environment = environment;
            return this;
        }

        public Builder environment(@Nullable List<TaskDefinitionKeyValuePairArgs> environment) {
            this.environment = Input.ofNullable(environment);
            return this;
        }

        public Builder environmentFiles(@Nullable Input<List<TaskDefinitionEnvironmentFileArgs>> environmentFiles) {
            this.environmentFiles = environmentFiles;
            return this;
        }

        public Builder environmentFiles(@Nullable List<TaskDefinitionEnvironmentFileArgs> environmentFiles) {
            this.environmentFiles = Input.ofNullable(environmentFiles);
            return this;
        }

        public Builder essential(@Nullable Input<Boolean> essential) {
            this.essential = essential;
            return this;
        }

        public Builder essential(@Nullable Boolean essential) {
            this.essential = Input.ofNullable(essential);
            return this;
        }

        public Builder extraHosts(@Nullable Input<List<TaskDefinitionHostEntryArgs>> extraHosts) {
            this.extraHosts = extraHosts;
            return this;
        }

        public Builder extraHosts(@Nullable List<TaskDefinitionHostEntryArgs> extraHosts) {
            this.extraHosts = Input.ofNullable(extraHosts);
            return this;
        }

        public Builder firelensConfiguration(@Nullable Input<TaskDefinitionFirelensConfigurationArgs> firelensConfiguration) {
            this.firelensConfiguration = firelensConfiguration;
            return this;
        }

        public Builder firelensConfiguration(@Nullable TaskDefinitionFirelensConfigurationArgs firelensConfiguration) {
            this.firelensConfiguration = Input.ofNullable(firelensConfiguration);
            return this;
        }

        public Builder healthCheck(@Nullable Input<TaskDefinitionHealthCheckArgs> healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }

        public Builder healthCheck(@Nullable TaskDefinitionHealthCheckArgs healthCheck) {
            this.healthCheck = Input.ofNullable(healthCheck);
            return this;
        }

        public Builder hostname(@Nullable Input<String> hostname) {
            this.hostname = hostname;
            return this;
        }

        public Builder hostname(@Nullable String hostname) {
            this.hostname = Input.ofNullable(hostname);
            return this;
        }

        public Builder image(@Nullable Input<String> image) {
            this.image = image;
            return this;
        }

        public Builder image(@Nullable String image) {
            this.image = Input.ofNullable(image);
            return this;
        }

        public Builder interactive(@Nullable Input<Boolean> interactive) {
            this.interactive = interactive;
            return this;
        }

        public Builder interactive(@Nullable Boolean interactive) {
            this.interactive = Input.ofNullable(interactive);
            return this;
        }

        public Builder links(@Nullable Input<List<String>> links) {
            this.links = links;
            return this;
        }

        public Builder links(@Nullable List<String> links) {
            this.links = Input.ofNullable(links);
            return this;
        }

        public Builder linuxParameters(@Nullable Input<TaskDefinitionLinuxParametersArgs> linuxParameters) {
            this.linuxParameters = linuxParameters;
            return this;
        }

        public Builder linuxParameters(@Nullable TaskDefinitionLinuxParametersArgs linuxParameters) {
            this.linuxParameters = Input.ofNullable(linuxParameters);
            return this;
        }

        public Builder logConfiguration(@Nullable Input<TaskDefinitionLogConfigurationArgs> logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }

        public Builder logConfiguration(@Nullable TaskDefinitionLogConfigurationArgs logConfiguration) {
            this.logConfiguration = Input.ofNullable(logConfiguration);
            return this;
        }

        public Builder memory(@Nullable Input<Integer> memory) {
            this.memory = memory;
            return this;
        }

        public Builder memory(@Nullable Integer memory) {
            this.memory = Input.ofNullable(memory);
            return this;
        }

        public Builder memoryReservation(@Nullable Input<Integer> memoryReservation) {
            this.memoryReservation = memoryReservation;
            return this;
        }

        public Builder memoryReservation(@Nullable Integer memoryReservation) {
            this.memoryReservation = Input.ofNullable(memoryReservation);
            return this;
        }

        public Builder mountPoints(@Nullable Input<List<TaskDefinitionMountPointArgs>> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }

        public Builder mountPoints(@Nullable List<TaskDefinitionMountPointArgs> mountPoints) {
            this.mountPoints = Input.ofNullable(mountPoints);
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

        public Builder portMappings(@Nullable Input<List<TaskDefinitionPortMappingArgs>> portMappings) {
            this.portMappings = portMappings;
            return this;
        }

        public Builder portMappings(@Nullable List<TaskDefinitionPortMappingArgs> portMappings) {
            this.portMappings = Input.ofNullable(portMappings);
            return this;
        }

        public Builder privileged(@Nullable Input<Boolean> privileged) {
            this.privileged = privileged;
            return this;
        }

        public Builder privileged(@Nullable Boolean privileged) {
            this.privileged = Input.ofNullable(privileged);
            return this;
        }

        public Builder pseudoTerminal(@Nullable Input<Boolean> pseudoTerminal) {
            this.pseudoTerminal = pseudoTerminal;
            return this;
        }

        public Builder pseudoTerminal(@Nullable Boolean pseudoTerminal) {
            this.pseudoTerminal = Input.ofNullable(pseudoTerminal);
            return this;
        }

        public Builder readonlyRootFilesystem(@Nullable Input<Boolean> readonlyRootFilesystem) {
            this.readonlyRootFilesystem = readonlyRootFilesystem;
            return this;
        }

        public Builder readonlyRootFilesystem(@Nullable Boolean readonlyRootFilesystem) {
            this.readonlyRootFilesystem = Input.ofNullable(readonlyRootFilesystem);
            return this;
        }

        public Builder repositoryCredentials(@Nullable Input<TaskDefinitionRepositoryCredentialsArgs> repositoryCredentials) {
            this.repositoryCredentials = repositoryCredentials;
            return this;
        }

        public Builder repositoryCredentials(@Nullable TaskDefinitionRepositoryCredentialsArgs repositoryCredentials) {
            this.repositoryCredentials = Input.ofNullable(repositoryCredentials);
            return this;
        }

        public Builder resourceRequirements(@Nullable Input<List<TaskDefinitionResourceRequirementArgs>> resourceRequirements) {
            this.resourceRequirements = resourceRequirements;
            return this;
        }

        public Builder resourceRequirements(@Nullable List<TaskDefinitionResourceRequirementArgs> resourceRequirements) {
            this.resourceRequirements = Input.ofNullable(resourceRequirements);
            return this;
        }

        public Builder secrets(@Nullable Input<List<TaskDefinitionSecretArgs>> secrets) {
            this.secrets = secrets;
            return this;
        }

        public Builder secrets(@Nullable List<TaskDefinitionSecretArgs> secrets) {
            this.secrets = Input.ofNullable(secrets);
            return this;
        }

        public Builder startTimeout(@Nullable Input<Integer> startTimeout) {
            this.startTimeout = startTimeout;
            return this;
        }

        public Builder startTimeout(@Nullable Integer startTimeout) {
            this.startTimeout = Input.ofNullable(startTimeout);
            return this;
        }

        public Builder stopTimeout(@Nullable Input<Integer> stopTimeout) {
            this.stopTimeout = stopTimeout;
            return this;
        }

        public Builder stopTimeout(@Nullable Integer stopTimeout) {
            this.stopTimeout = Input.ofNullable(stopTimeout);
            return this;
        }

        public Builder systemControls(@Nullable Input<List<TaskDefinitionSystemControlArgs>> systemControls) {
            this.systemControls = systemControls;
            return this;
        }

        public Builder systemControls(@Nullable List<TaskDefinitionSystemControlArgs> systemControls) {
            this.systemControls = Input.ofNullable(systemControls);
            return this;
        }

        public Builder ulimits(@Nullable Input<List<TaskDefinitionUlimitArgs>> ulimits) {
            this.ulimits = ulimits;
            return this;
        }

        public Builder ulimits(@Nullable List<TaskDefinitionUlimitArgs> ulimits) {
            this.ulimits = Input.ofNullable(ulimits);
            return this;
        }

        public Builder user(@Nullable Input<String> user) {
            this.user = user;
            return this;
        }

        public Builder user(@Nullable String user) {
            this.user = Input.ofNullable(user);
            return this;
        }

        public Builder volumesFrom(@Nullable Input<List<TaskDefinitionVolumeFromArgs>> volumesFrom) {
            this.volumesFrom = volumesFrom;
            return this;
        }

        public Builder volumesFrom(@Nullable List<TaskDefinitionVolumeFromArgs> volumesFrom) {
            this.volumesFrom = Input.ofNullable(volumesFrom);
            return this;
        }

        public Builder workingDirectory(@Nullable Input<String> workingDirectory) {
            this.workingDirectory = workingDirectory;
            return this;
        }

        public Builder workingDirectory(@Nullable String workingDirectory) {
            this.workingDirectory = Input.ofNullable(workingDirectory);
            return this;
        }
        public TaskDefinitionContainerDefinitionArgs build() {
            return new TaskDefinitionContainerDefinitionArgs(command, cpu, dependsOn, disableNetworking, dnsSearchDomains, dnsServers, dockerLabels, dockerSecurityOptions, entryPoint, environment, environmentFiles, essential, extraHosts, firelensConfiguration, healthCheck, hostname, image, interactive, links, linuxParameters, logConfiguration, memory, memoryReservation, mountPoints, name, portMappings, privileged, pseudoTerminal, readonlyRootFilesystem, repositoryCredentials, resourceRequirements, secrets, startTimeout, stopTimeout, systemControls, ulimits, user, volumesFrom, workingDirectory);
        }
    }
}
