// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis.v1.inputs.AliasContextArgs;
import com.pulumi.googlenative.containeranalysis.v1.inputs.RepoIdArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A CloudRepoSourceContext denotes a particular revision in a Google Cloud Source Repo.
 * 
 */
public final class CloudRepoSourceContextArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudRepoSourceContextArgs Empty = new CloudRepoSourceContextArgs();

    /**
     * An alias, which may be a branch or tag.
     * 
     */
    @Import(name="aliasContext")
    private @Nullable Output<AliasContextArgs> aliasContext;

    /**
     * @return An alias, which may be a branch or tag.
     * 
     */
    public Optional<Output<AliasContextArgs>> aliasContext() {
        return Optional.ofNullable(this.aliasContext);
    }

    /**
     * The ID of the repo.
     * 
     */
    @Import(name="repoId")
    private @Nullable Output<RepoIdArgs> repoId;

    /**
     * @return The ID of the repo.
     * 
     */
    public Optional<Output<RepoIdArgs>> repoId() {
        return Optional.ofNullable(this.repoId);
    }

    /**
     * A revision ID.
     * 
     */
    @Import(name="revisionId")
    private @Nullable Output<String> revisionId;

    /**
     * @return A revision ID.
     * 
     */
    public Optional<Output<String>> revisionId() {
        return Optional.ofNullable(this.revisionId);
    }

    private CloudRepoSourceContextArgs() {}

    private CloudRepoSourceContextArgs(CloudRepoSourceContextArgs $) {
        this.aliasContext = $.aliasContext;
        this.repoId = $.repoId;
        this.revisionId = $.revisionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudRepoSourceContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudRepoSourceContextArgs $;

        public Builder() {
            $ = new CloudRepoSourceContextArgs();
        }

        public Builder(CloudRepoSourceContextArgs defaults) {
            $ = new CloudRepoSourceContextArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aliasContext An alias, which may be a branch or tag.
         * 
         * @return builder
         * 
         */
        public Builder aliasContext(@Nullable Output<AliasContextArgs> aliasContext) {
            $.aliasContext = aliasContext;
            return this;
        }

        /**
         * @param aliasContext An alias, which may be a branch or tag.
         * 
         * @return builder
         * 
         */
        public Builder aliasContext(AliasContextArgs aliasContext) {
            return aliasContext(Output.of(aliasContext));
        }

        /**
         * @param repoId The ID of the repo.
         * 
         * @return builder
         * 
         */
        public Builder repoId(@Nullable Output<RepoIdArgs> repoId) {
            $.repoId = repoId;
            return this;
        }

        /**
         * @param repoId The ID of the repo.
         * 
         * @return builder
         * 
         */
        public Builder repoId(RepoIdArgs repoId) {
            return repoId(Output.of(repoId));
        }

        /**
         * @param revisionId A revision ID.
         * 
         * @return builder
         * 
         */
        public Builder revisionId(@Nullable Output<String> revisionId) {
            $.revisionId = revisionId;
            return this;
        }

        /**
         * @param revisionId A revision ID.
         * 
         * @return builder
         * 
         */
        public Builder revisionId(String revisionId) {
            return revisionId(Output.of(revisionId));
        }

        public CloudRepoSourceContextArgs build() {
            return $;
        }
    }

}
