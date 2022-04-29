// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TargetPoolArgs extends ResourceArgs {

    public static final TargetPoolArgs Empty = new TargetPoolArgs();

    /**
     * URL to the backup target pool. Must also set
     * failover\_ratio.
     * 
     */
    @Import(name="backupPool")
    private @Nullable Output<String> backupPool;

    /**
     * @return URL to the backup target pool. Must also set
     * failover\_ratio.
     * 
     */
    public Optional<Output<String>> backupPool() {
        return Optional.ofNullable(this.backupPool);
    }

    /**
     * Textual description field.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Textual description field.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Ratio (0 to 1) of failed nodes before using the
     * backup pool (which must also be set).
     * 
     */
    @Import(name="failoverRatio")
    private @Nullable Output<Double> failoverRatio;

    /**
     * @return Ratio (0 to 1) of failed nodes before using the
     * backup pool (which must also be set).
     * 
     */
    public Optional<Output<Double>> failoverRatio() {
        return Optional.ofNullable(this.failoverRatio);
    }

    /**
     * List of zero or one health check name or self_link. Only
     * legacy `gcp.compute.HttpHealthCheck` is supported.
     * 
     */
    @Import(name="healthChecks")
    private @Nullable Output<String> healthChecks;

    /**
     * @return List of zero or one health check name or self_link. Only
     * legacy `gcp.compute.HttpHealthCheck` is supported.
     * 
     */
    public Optional<Output<String>> healthChecks() {
        return Optional.ofNullable(this.healthChecks);
    }

    /**
     * List of instances in the pool. They can be given as
     * URLs, or in the form of &#34;zone/name&#34;. Note that the instances need not exist
     * at the time of target pool creation, so there is no need to use the
     * interpolation to create a dependency on the instances from the
     * target pool.
     * 
     */
    @Import(name="instances")
    private @Nullable Output<List<String>> instances;

    /**
     * @return List of instances in the pool. They can be given as
     * URLs, or in the form of &#34;zone/name&#34;. Note that the instances need not exist
     * at the time of target pool creation, so there is no need to use the
     * interpolation to create a dependency on the instances from the
     * target pool.
     * 
     */
    public Optional<Output<List<String>>> instances() {
        return Optional.ofNullable(this.instances);
    }

    /**
     * A unique name for the resource, required by GCE. Changing
     * this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique name for the resource, required by GCE. Changing
     * this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Where the target pool resides. Defaults to project
     * region.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Where the target pool resides. Defaults to project
     * region.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * How to distribute load. Options are &#34;NONE&#34; (no
     * affinity). &#34;CLIENT\_IP&#34; (hash of the source/dest addresses / ports), and
     * &#34;CLIENT\_IP\_PROTO&#34; also includes the protocol (default &#34;NONE&#34;).
     * 
     */
    @Import(name="sessionAffinity")
    private @Nullable Output<String> sessionAffinity;

    /**
     * @return How to distribute load. Options are &#34;NONE&#34; (no
     * affinity). &#34;CLIENT\_IP&#34; (hash of the source/dest addresses / ports), and
     * &#34;CLIENT\_IP\_PROTO&#34; also includes the protocol (default &#34;NONE&#34;).
     * 
     */
    public Optional<Output<String>> sessionAffinity() {
        return Optional.ofNullable(this.sessionAffinity);
    }

    private TargetPoolArgs() {}

    private TargetPoolArgs(TargetPoolArgs $) {
        this.backupPool = $.backupPool;
        this.description = $.description;
        this.failoverRatio = $.failoverRatio;
        this.healthChecks = $.healthChecks;
        this.instances = $.instances;
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
        this.sessionAffinity = $.sessionAffinity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TargetPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TargetPoolArgs $;

        public Builder() {
            $ = new TargetPoolArgs();
        }

        public Builder(TargetPoolArgs defaults) {
            $ = new TargetPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupPool URL to the backup target pool. Must also set
         * failover\_ratio.
         * 
         * @return builder
         * 
         */
        public Builder backupPool(@Nullable Output<String> backupPool) {
            $.backupPool = backupPool;
            return this;
        }

        /**
         * @param backupPool URL to the backup target pool. Must also set
         * failover\_ratio.
         * 
         * @return builder
         * 
         */
        public Builder backupPool(String backupPool) {
            return backupPool(Output.of(backupPool));
        }

        /**
         * @param description Textual description field.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Textual description field.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param failoverRatio Ratio (0 to 1) of failed nodes before using the
         * backup pool (which must also be set).
         * 
         * @return builder
         * 
         */
        public Builder failoverRatio(@Nullable Output<Double> failoverRatio) {
            $.failoverRatio = failoverRatio;
            return this;
        }

        /**
         * @param failoverRatio Ratio (0 to 1) of failed nodes before using the
         * backup pool (which must also be set).
         * 
         * @return builder
         * 
         */
        public Builder failoverRatio(Double failoverRatio) {
            return failoverRatio(Output.of(failoverRatio));
        }

        /**
         * @param healthChecks List of zero or one health check name or self_link. Only
         * legacy `gcp.compute.HttpHealthCheck` is supported.
         * 
         * @return builder
         * 
         */
        public Builder healthChecks(@Nullable Output<String> healthChecks) {
            $.healthChecks = healthChecks;
            return this;
        }

        /**
         * @param healthChecks List of zero or one health check name or self_link. Only
         * legacy `gcp.compute.HttpHealthCheck` is supported.
         * 
         * @return builder
         * 
         */
        public Builder healthChecks(String healthChecks) {
            return healthChecks(Output.of(healthChecks));
        }

        /**
         * @param instances List of instances in the pool. They can be given as
         * URLs, or in the form of &#34;zone/name&#34;. Note that the instances need not exist
         * at the time of target pool creation, so there is no need to use the
         * interpolation to create a dependency on the instances from the
         * target pool.
         * 
         * @return builder
         * 
         */
        public Builder instances(@Nullable Output<List<String>> instances) {
            $.instances = instances;
            return this;
        }

        /**
         * @param instances List of instances in the pool. They can be given as
         * URLs, or in the form of &#34;zone/name&#34;. Note that the instances need not exist
         * at the time of target pool creation, so there is no need to use the
         * interpolation to create a dependency on the instances from the
         * target pool.
         * 
         * @return builder
         * 
         */
        public Builder instances(List<String> instances) {
            return instances(Output.of(instances));
        }

        /**
         * @param instances List of instances in the pool. They can be given as
         * URLs, or in the form of &#34;zone/name&#34;. Note that the instances need not exist
         * at the time of target pool creation, so there is no need to use the
         * interpolation to create a dependency on the instances from the
         * target pool.
         * 
         * @return builder
         * 
         */
        public Builder instances(String... instances) {
            return instances(List.of(instances));
        }

        /**
         * @param name A unique name for the resource, required by GCE. Changing
         * this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique name for the resource, required by GCE. Changing
         * this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region Where the target pool resides. Defaults to project
         * region.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Where the target pool resides. Defaults to project
         * region.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param sessionAffinity How to distribute load. Options are &#34;NONE&#34; (no
         * affinity). &#34;CLIENT\_IP&#34; (hash of the source/dest addresses / ports), and
         * &#34;CLIENT\_IP\_PROTO&#34; also includes the protocol (default &#34;NONE&#34;).
         * 
         * @return builder
         * 
         */
        public Builder sessionAffinity(@Nullable Output<String> sessionAffinity) {
            $.sessionAffinity = sessionAffinity;
            return this;
        }

        /**
         * @param sessionAffinity How to distribute load. Options are &#34;NONE&#34; (no
         * affinity). &#34;CLIENT\_IP&#34; (hash of the source/dest addresses / ports), and
         * &#34;CLIENT\_IP\_PROTO&#34; also includes the protocol (default &#34;NONE&#34;).
         * 
         * @return builder
         * 
         */
        public Builder sessionAffinity(String sessionAffinity) {
            return sessionAffinity(Output.of(sessionAffinity));
        }

        public TargetPoolArgs build() {
            return $;
        }
    }

}
