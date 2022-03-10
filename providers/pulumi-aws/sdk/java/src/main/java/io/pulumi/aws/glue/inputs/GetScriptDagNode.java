// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.aws.glue.inputs.GetScriptDagNodeArg;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetScriptDagNode extends io.pulumi.resources.InvokeArgs {

    public static final GetScriptDagNode Empty = new GetScriptDagNode();

    /**
     * Nested configuration an argument or property of a node. Defined below.
     * 
     */
    @InputImport(name="args", required=true)
      private final List<GetScriptDagNodeArg> args;

    public List<GetScriptDagNodeArg> getArgs() {
        return this.args;
    }

    /**
     * A node identifier that is unique within the node's graph.
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The line number of the node.
     * 
     */
    @InputImport(name="lineNumber")
      private final @Nullable Integer lineNumber;

    public Optional<Integer> getLineNumber() {
        return this.lineNumber == null ? Optional.empty() : Optional.ofNullable(this.lineNumber);
    }

    /**
     * The type of node this is.
     * 
     */
    @InputImport(name="nodeType", required=true)
      private final String nodeType;

    public String getNodeType() {
        return this.nodeType;
    }

    public GetScriptDagNode(
        List<GetScriptDagNodeArg> args,
        String id,
        @Nullable Integer lineNumber,
        String nodeType) {
        this.args = Objects.requireNonNull(args, "expected parameter 'args' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.lineNumber = lineNumber;
        this.nodeType = Objects.requireNonNull(nodeType, "expected parameter 'nodeType' to be non-null");
    }

    private GetScriptDagNode() {
        this.args = List.of();
        this.id = null;
        this.lineNumber = null;
        this.nodeType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScriptDagNode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetScriptDagNodeArg> args;
        private String id;
        private @Nullable Integer lineNumber;
        private String nodeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScriptDagNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.id = defaults.id;
    	      this.lineNumber = defaults.lineNumber;
    	      this.nodeType = defaults.nodeType;
        }

        public Builder args(List<GetScriptDagNodeArg> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder lineNumber(@Nullable Integer lineNumber) {
            this.lineNumber = lineNumber;
            return this;
        }

        public Builder nodeType(String nodeType) {
            this.nodeType = Objects.requireNonNull(nodeType);
            return this;
        }
        public GetScriptDagNode build() {
            return new GetScriptDagNode(args, id, lineNumber, nodeType);
        }
    }
}
