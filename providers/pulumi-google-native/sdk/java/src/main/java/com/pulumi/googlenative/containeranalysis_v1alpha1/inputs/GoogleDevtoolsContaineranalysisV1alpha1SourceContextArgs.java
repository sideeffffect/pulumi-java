// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextArgs;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A SourceContext is a reference to a tree of files. A SourceContext together with a path point to a unique revision of a single file or directory.
 * 
 */
public final class GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs Empty = new GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs();

    /**
     * A SourceContext referring to a revision in a Google Cloud Source Repo.
     * 
     */
    @Import(name="cloudRepo")
    private @Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextArgs> cloudRepo;

    /**
     * @return A SourceContext referring to a revision in a Google Cloud Source Repo.
     * 
     */
    public Optional<Output<GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextArgs>> cloudRepo() {
        return Optional.ofNullable(this.cloudRepo);
    }

    /**
     * A SourceContext referring to a Gerrit project.
     * 
     */
    @Import(name="gerrit")
    private @Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs> gerrit;

    /**
     * @return A SourceContext referring to a Gerrit project.
     * 
     */
    public Optional<Output<GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs>> gerrit() {
        return Optional.ofNullable(this.gerrit);
    }

    /**
     * A SourceContext referring to any third party Git repo (e.g., GitHub).
     * 
     */
    @Import(name="git")
    private @Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs> git;

    /**
     * @return A SourceContext referring to any third party Git repo (e.g., GitHub).
     * 
     */
    public Optional<Output<GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs>> git() {
        return Optional.ofNullable(this.git);
    }

    /**
     * Labels with user defined metadata.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels with user defined metadata.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    private GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs() {}

    private GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs(GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs $) {
        this.cloudRepo = $.cloudRepo;
        this.gerrit = $.gerrit;
        this.git = $.git;
        this.labels = $.labels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs $;

        public Builder() {
            $ = new GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs();
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs defaults) {
            $ = new GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudRepo A SourceContext referring to a revision in a Google Cloud Source Repo.
         * 
         * @return builder
         * 
         */
        public Builder cloudRepo(@Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextArgs> cloudRepo) {
            $.cloudRepo = cloudRepo;
            return this;
        }

        /**
         * @param cloudRepo A SourceContext referring to a revision in a Google Cloud Source Repo.
         * 
         * @return builder
         * 
         */
        public Builder cloudRepo(GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextArgs cloudRepo) {
            return cloudRepo(Output.of(cloudRepo));
        }

        /**
         * @param gerrit A SourceContext referring to a Gerrit project.
         * 
         * @return builder
         * 
         */
        public Builder gerrit(@Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs> gerrit) {
            $.gerrit = gerrit;
            return this;
        }

        /**
         * @param gerrit A SourceContext referring to a Gerrit project.
         * 
         * @return builder
         * 
         */
        public Builder gerrit(GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs gerrit) {
            return gerrit(Output.of(gerrit));
        }

        /**
         * @param git A SourceContext referring to any third party Git repo (e.g., GitHub).
         * 
         * @return builder
         * 
         */
        public Builder git(@Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs> git) {
            $.git = git;
            return this;
        }

        /**
         * @param git A SourceContext referring to any third party Git repo (e.g., GitHub).
         * 
         * @return builder
         * 
         */
        public Builder git(GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs git) {
            return git(Output.of(git));
        }

        /**
         * @param labels Labels with user defined metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels with user defined metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs build() {
            return $;
        }
    }

}
