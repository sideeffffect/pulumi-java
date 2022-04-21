// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GoogleDevtoolsContaineranalysisV1alpha1AliasContextResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A SourceContext referring to a Gerrit project.
 * 
 */
public final class GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse Empty = new GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse();

    /**
     * An alias, which may be a branch or tag.
     * 
     */
    @Import(name="aliasContext", required=true)
    private GoogleDevtoolsContaineranalysisV1alpha1AliasContextResponse aliasContext;

    public GoogleDevtoolsContaineranalysisV1alpha1AliasContextResponse aliasContext() {
        return this.aliasContext;
    }

    /**
     * The full project name within the host. Projects may be nested, so &#34;project/subproject&#34; is a valid project name. The &#34;repo name&#34; is the hostURI/project.
     * 
     */
    @Import(name="gerritProject", required=true)
    private String gerritProject;

    public String gerritProject() {
        return this.gerritProject;
    }

    /**
     * The URI of a running Gerrit instance.
     * 
     */
    @Import(name="hostUri", required=true)
    private String hostUri;

    public String hostUri() {
        return this.hostUri;
    }

    /**
     * A revision (commit) ID.
     * 
     */
    @Import(name="revisionId", required=true)
    private String revisionId;

    public String revisionId() {
        return this.revisionId;
    }

    private GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse() {}

    private GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse(GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse $) {
        this.aliasContext = $.aliasContext;
        this.gerritProject = $.gerritProject;
        this.hostUri = $.hostUri;
        this.revisionId = $.revisionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse $;

        public Builder() {
            $ = new GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse();
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse defaults) {
            $ = new GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse(Objects.requireNonNull(defaults));
        }

        public Builder aliasContext(GoogleDevtoolsContaineranalysisV1alpha1AliasContextResponse aliasContext) {
            $.aliasContext = aliasContext;
            return this;
        }

        public Builder gerritProject(String gerritProject) {
            $.gerritProject = gerritProject;
            return this;
        }

        public Builder hostUri(String hostUri) {
            $.hostUri = hostUri;
            return this;
        }

        public Builder revisionId(String revisionId) {
            $.revisionId = revisionId;
            return this;
        }

        public GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse build() {
            $.aliasContext = Objects.requireNonNull($.aliasContext, "expected parameter 'aliasContext' to be non-null");
            $.gerritProject = Objects.requireNonNull($.gerritProject, "expected parameter 'gerritProject' to be non-null");
            $.hostUri = Objects.requireNonNull($.hostUri, "expected parameter 'hostUri' to be non-null");
            $.revisionId = Objects.requireNonNull($.revisionId, "expected parameter 'revisionId' to be non-null");
            return $;
        }
    }

}
