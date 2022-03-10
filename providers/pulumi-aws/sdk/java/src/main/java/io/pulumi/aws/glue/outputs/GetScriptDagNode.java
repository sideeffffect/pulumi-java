// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.aws.glue.outputs.GetScriptDagNodeArg;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetScriptDagNode {
    /**
     * Nested configuration an argument or property of a node. Defined below.
     * 
     */
    private final List<GetScriptDagNodeArg> args;
    /**
     * A node identifier that is unique within the node's graph.
     * 
     */
    private final String id;
    /**
     * The line number of the node.
     * 
     */
    private final @Nullable Integer lineNumber;
    /**
     * The type of node this is.
     * 
     */
    private final String nodeType;

    @OutputCustomType.Constructor
    private GetScriptDagNode(
        @OutputCustomType.Parameter("args") List<GetScriptDagNodeArg> args,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("lineNumber") @Nullable Integer lineNumber,
        @OutputCustomType.Parameter("nodeType") String nodeType) {
        this.args = args;
        this.id = id;
        this.lineNumber = lineNumber;
        this.nodeType = nodeType;
    }

    /**
     * Nested configuration an argument or property of a node. Defined below.
     * 
    */
    public List<GetScriptDagNodeArg> getArgs() {
        return this.args;
    }
    /**
     * A node identifier that is unique within the node's graph.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The line number of the node.
     * 
    */
    public Optional<Integer> getLineNumber() {
        return Optional.ofNullable(this.lineNumber);
    }
    /**
     * The type of node this is.
     * 
    */
    public String getNodeType() {
        return this.nodeType;
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
