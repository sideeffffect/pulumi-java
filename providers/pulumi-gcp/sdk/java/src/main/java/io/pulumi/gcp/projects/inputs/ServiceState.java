// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceState extends io.pulumi.resources.ResourceArgs {

    public static final ServiceState Empty = new ServiceState();

    /**
     * If `true`, services that are enabled
     * and which depend on this service should also be disabled when this service is
     * destroyed. If `false` or unset, an error will be generated if any enabled
     * services depend on this service when destroying it.
     * 
     */
    @Import(name="disableDependentServices")
      private final @Nullable Output<Boolean> disableDependentServices;

    public Output<Boolean> disableDependentServices() {
        return this.disableDependentServices == null ? Codegen.empty() : this.disableDependentServices;
    }

    /**
     * If true, disable the service when the resource is destroyed. Defaults to true. May be useful in the event that a project is long-lived but the infrastructure running in that project changes frequently.
     * 
     */
    @Import(name="disableOnDestroy")
      private final @Nullable Output<Boolean> disableOnDestroy;

    public Output<Boolean> disableOnDestroy() {
        return this.disableOnDestroy == null ? Codegen.empty() : this.disableOnDestroy;
    }

    /**
     * The project ID. If not provided, the provider project
     * is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The service to enable.
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> service() {
        return this.service == null ? Codegen.empty() : this.service;
    }

    public ServiceState(
        @Nullable Output<Boolean> disableDependentServices,
        @Nullable Output<Boolean> disableOnDestroy,
        @Nullable Output<String> project,
        @Nullable Output<String> service) {
        this.disableDependentServices = disableDependentServices;
        this.disableOnDestroy = disableOnDestroy;
        this.project = project;
        this.service = service;
    }

    private ServiceState() {
        this.disableDependentServices = Codegen.empty();
        this.disableOnDestroy = Codegen.empty();
        this.project = Codegen.empty();
        this.service = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> disableDependentServices;
        private @Nullable Output<Boolean> disableOnDestroy;
        private @Nullable Output<String> project;
        private @Nullable Output<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableDependentServices = defaults.disableDependentServices;
    	      this.disableOnDestroy = defaults.disableOnDestroy;
    	      this.project = defaults.project;
    	      this.service = defaults.service;
        }

        public Builder disableDependentServices(@Nullable Output<Boolean> disableDependentServices) {
            this.disableDependentServices = disableDependentServices;
            return this;
        }
        public Builder disableDependentServices(@Nullable Boolean disableDependentServices) {
            this.disableDependentServices = Codegen.ofNullable(disableDependentServices);
            return this;
        }
        public Builder disableOnDestroy(@Nullable Output<Boolean> disableOnDestroy) {
            this.disableOnDestroy = disableOnDestroy;
            return this;
        }
        public Builder disableOnDestroy(@Nullable Boolean disableOnDestroy) {
            this.disableOnDestroy = Codegen.ofNullable(disableOnDestroy);
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
        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = Codegen.ofNullable(service);
            return this;
        }        public ServiceState build() {
            return new ServiceState(disableDependentServices, disableOnDestroy, project, service);
        }
    }
}
