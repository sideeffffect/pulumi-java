// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A GitSourceContext denotes a particular revision in a third party Git repository (e.g., GitHub).
 * 
 */
public final class GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs Empty = new GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs();

    /**
     * Git commit hash.
     * 
     */
    @InputImport(name="revisionId", required=true)
      private final Input<String> revisionId;

    public Input<String> getRevisionId() {
        return this.revisionId;
    }

    /**
     * Git repository URL.
     * 
     */
    @InputImport(name="url")
      private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs(
        Input<String> revisionId,
        @Nullable Input<String> url) {
        this.revisionId = Objects.requireNonNull(revisionId, "expected parameter 'revisionId' to be non-null");
        this.url = url;
    }

    private GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs() {
        this.revisionId = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> revisionId;
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.revisionId = defaults.revisionId;
    	      this.url = defaults.url;
        }

        public Builder revisionId(Input<String> revisionId) {
            this.revisionId = Objects.requireNonNull(revisionId);
            return this;
        }

        public Builder revisionId(String revisionId) {
            this.revisionId = Input.of(Objects.requireNonNull(revisionId));
            return this;
        }

        public Builder url(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder url(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }
        public GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs build() {
            return new GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs(revisionId, url);
        }
    }
}
